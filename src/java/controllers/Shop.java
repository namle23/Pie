package controllers;

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
        String page = request.getParameter("page");
        int pageInt = Integer.parseInt(page);

        if (pageInt != 1) {
            pageInt = Integer.parseInt(page);
        } else {
            pageInt = 1;
        }

        int limit = 6;
        int start_prd = (pageInt - 1) * limit;

        Connection conn = null;

        try {
            conn = ds.getConnection();
        } catch (SQLException ex) {
            throw new ServletException();
        }

        ShopAction shopAction = new ShopAction(conn);

        String type = request.getParameter("type");

        request.setAttribute("type", type);

        //set display with type
        if (type != null) {
            try {
                shopAction.displayWithType(pageInt, start_prd, type);
            } catch (SQLException ex) {
                Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page = request.getParameter("page");
        int pageInt = Integer.parseInt(page);

        if (pageInt != 1) {
            pageInt = Integer.parseInt(page);
        } else {
            pageInt = 1;
        }

        int limit = 6;
        int start_prd = (pageInt - 1) * limit;

        Connection conn = null;

        try {
            conn = ds.getConnection();
        } catch (SQLException ex) {
            throw new ServletException();
        }

        ShopAction shopAction = new ShopAction(conn);

        String search = request.getParameter("search");

        request.setAttribute("search", search);

        //display products with search
        if (search != null) {
            try {
                shopAction.displayWithSearch(search, start_prd);
            } catch (SQLException ex) {
                Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
