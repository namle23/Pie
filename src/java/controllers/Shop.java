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
import javax.sql.DataSource;
import utils.ShopAction;

@WebServlet(name = "Shop", urlPatterns = {"/Shop"})
public class Shop extends HttpServlet {

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

        Connection conn = null;

        try {
            conn = ds.getConnection();
        } catch (SQLException ex) {
            throw new ServletException();
        }

        ShopAction shopAction = new ShopAction(conn);

        String type = request.getParameter("type");

        //set display with type
        if (type != null) {
            shopAction.displayWithType(1, type);
            request.getRequestDispatcher("/shop.jsp").forward(request, response);
        } else {
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
        } catch (SQLException ex) {
            throw new ServletException();
        }

        ShopAction shopAction = new ShopAction(conn);

        String keyword = request.getParameter("keyword");

        //set display with type
        if (action.equals("search")) {
            shopAction.displayWithSearch(keyword, 1);
            request.getRequestDispatcher("/shop.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}
