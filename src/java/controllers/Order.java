package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import utils.OrderAction;

@WebServlet(name = "Order", urlPatterns = {"/Order"})
public class Order extends HttpServlet {

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
        } catch (SQLException ex) {
            throw new ServletException();
        }

        OrderAction orderAction = new OrderAction(conn);

        HttpSession session = request.getSession(); //get current session

        if (session.getAttribute("username") != null) {

        } else {

        }
    }
}
