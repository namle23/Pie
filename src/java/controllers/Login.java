package controllers;

import beans.Users;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import utils.ValidateLogin;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    private DataSource ds;

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            InitialContext initContext = new InitialContext();

            Context env = (Context) initContext.lookup("java:comp/env");

            ds = (DataSource) env.lookup("jdbc/dbs");

        } catch (NamingException e) {
            throw new ServletException();
        }
    }

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

        Connection conn = null;

        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            throw new ServletException();
        }

        ValidateLogin vl = new ValidateLogin(conn);

        if (action.equals("dologin")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            Users user = new Users(username, password);

            request.setAttribute("username", username);
            request.setAttribute("password", "");

            try {
                if (vl.login(username, password)) {
                    request.getRequestDispatcher("/Welcome").forward(request, response);
                } else {
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

            if (!newpassword1.equals(newpassword2)) {
                request.getRequestDispatcher("/register.jsp").forward(request, response);
            } else {
                Users user = new Users(newusername, newpassword1, newfullname, newaddress, newphone);

                if (!user.validate()) {
                    request.getRequestDispatcher("/register.jsp").forward(request, response);
                } else {
                    try {
                        if (vl.exists(newusername)) {
                            request.getRequestDispatcher("/register.jsp").forward(request, response);
                        } else {
                            vl.create(newusername, newpassword1, newfullname, newaddress, newphone);
                            request.getRequestDispatcher("/success.jsp").forward(request, response);
                        }
                    } catch (SQLException e) {
                        request.getRequestDispatcher("/error.jsp").forward(request, response);
                    }
                }
            }

        }

        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
