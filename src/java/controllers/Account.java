package controllers;

import beans.Users;
import data.AccountDB;
import data.ConnectionPool;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        
        if (action.equals("dologin")) {
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
                request.getRequestDispatcher("/register.jsp").forward(request, response);
            }
        } else if (action.equals("register")) {
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
                            request.getRequestDispatcher("/success.jsp").forward(request, response);
                        }
                    } catch (SQLException e) {
                        request.getRequestDispatcher("/error.jsp").forward(request, response);
                    }
                }
            }
            
        } else if (action.equals("dologout")) {
            request.getSession().invalidate();
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
        
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
