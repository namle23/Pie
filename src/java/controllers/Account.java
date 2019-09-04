package controllers;

import beans.Users;
import data.AccountDB;
import data.ConnectionPool;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(name = "Account", urlPatterns = {"/Account"})
public class Account extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            return;
        }

        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        AccountDB accountDB = new AccountDB(conn);

        switch (action) {
            case "dologin": {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                HttpSession session = request.getSession(); //Set session for user
                session.setAttribute("username", username);
                session.setAttribute("password", "");
                try {
                    if (accountDB.login(username, password)) {

                        Users user = accountDB.show(username);

                        int id = user.getId();
                        String fullname = user.getFullName();
                        String address = user.getAddress();
                        String phone = user.getPhone();

                        session.setAttribute("id", id);
                        session.setAttribute("fullname", fullname);
                        session.setAttribute("address", address);
                        session.setAttribute("phone", phone);
                        session.setAttribute("user", user);

                        request.getRequestDispatcher("/index.jsp").forward(request, response);
                    } else {
                        request.setAttribute("message", "Check username or password.");
                        request.getRequestDispatcher("/login.jsp").forward(request, response);
                    }
                } catch (SQLException ex) {
                    log(ex + " DOLOGIN");
                    request.getRequestDispatcher("/register.jsp").forward(request, response);
                }
                break;
            }
            case "register":
                String newusername = request.getParameter("newusername");
                String newpassword1 = request.getParameter("newpassword1");
                String newpassword2 = request.getParameter("newpassword2");
                String newfullname = request.getParameter("newfullname");
                String newaddress = request.getParameter("newaddress");
                String newphone = request.getParameter("newphone");
                request.setAttribute("newusername", newusername);
                request.setAttribute("newpassword1", "");
                request.setAttribute("newpassword2", "");
                request.setAttribute("newfullname", newfullname);
                request.setAttribute("newaddress", newaddress);
                request.setAttribute("newphone", newphone);
                request.setAttribute("message", "");
                if (!newpassword1.equals(newpassword2)) {
                    //Password not match
                    request.setAttribute("message", "Password not match.");
                    request.getRequestDispatcher("/register.jsp").forward(request, response);
                } else {
                    Users user = new Users(newusername, newpassword1, newfullname, newaddress, newphone);

                    if (!user.validate()) {
                        //Password wrong format
                        request.setAttribute("message", user.getMessage());
                        request.getRequestDispatcher("/register.jsp").forward(request, response);
                    } else {
                        try {
                            if (accountDB.exists(newusername)) {
                                //Username exists
                                request.setAttribute("message", "Username is taken.");
                                request.getRequestDispatcher("/register.jsp").forward(request, response);
                            } else {
                                accountDB.create(newusername, newpassword1, newfullname, newaddress, newphone);
                                request.getRequestDispatcher("/index.jsp").forward(request, response);
                            }
                        } catch (SQLException ex) {
                            log(ex + " REGISTER");
                            request.getRequestDispatcher("/register.jsp").forward(request, response);
                        }
                    }
                }
                break;
            case "dologout":
                request.getSession().invalidate();
                response.sendRedirect(request.getContextPath() + "/index.jsp");
                break;
            case "docomment": { //Comment action
                HttpSession session = request.getSession(); //Set session
                String username = (String) session.getAttribute("username"); //Get username
                ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
                Map<String, InputStream> fileMap = new HashMap<>(); //HashMap to store photo's detail

                try {
                    List<FileItem> multifiles = sf.parseRequest(request); //Store all stream input in List

                    //StringBuilder to store each input value
                    StringBuilder comment = new StringBuilder();
                    StringBuilder photo = new StringBuilder();
                    StringBuilder strDateFormatted = new StringBuilder();

                    //Iterate through all the input
                    multifiles.forEach((item) -> {
                        //If input is from field "comment"
                        if (item.getFieldName().equals("comment")) {
                            comment.append(item.getString()); //Get comment value
                        } else if (item.getFieldName().equals("photo")) { //If input is from "photo" field
                            photo.append(item.getName());

                            try {
                                //gives file name
                                fileMap.put(item.getName(), item.getInputStream()); //Store photo's detail

                                item.write(new File("C:\\Users\\namle\\uploads" + item.getName())); //Create file (upload file) to provided location
                            } catch (IOException ex) {
                                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (Exception ex) {
                                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    });

                    //Create and record the posted time
                    DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    strDateFormatted.append(now);

                    try {
                        //Force user to write a comment
                        if (comment.toString().equals("")) {
                            //Empty comment error
                            request.setAttribute("message", "Write something my friend.");
                            request.getRequestDispatcher("/article-detail.jsp").forward(request, response);
                        } else { //Proceed if comment is written
                            accountDB.comment(username, comment.toString(), photo.toString(), strDateFormatted.toString());
                            request.setAttribute("message", "Very nice comment.");
                            request.getRequestDispatcher("/article-detail.jsp").forward(request, response);
                        }
                    } catch (SQLException ex) {
                        log(ex + " COMMENT");
                        request.getRequestDispatcher("/register.jsp").forward(request, response);
                    }
                } catch (FileUploadException | IOException | ServletException ex) {
                    log(ex + "");
                    Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
            default:
                break;
        }

        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
