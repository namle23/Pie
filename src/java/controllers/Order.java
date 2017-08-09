package controllers;

import beans.Invoice;
import beans.LineCart;
import beans.Users;
import data.CartDB;
import data.OrderDB;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Order", urlPatterns = {"/Order"})
public class Order extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        if (session.getAttribute("username") != null) {
            addOrderLogged(request, response);
            session.setAttribute("success", "Order placed successfully");
            getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
        } else if (session.getAttribute("username") == null) {
            addOrderNoLogged(request, response);
            session.setAttribute("success", "Order placed successfully");
            getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/thanks.jsp").forward(request, response);
        }
    }

    private void addOrderLogged(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        CartDB cart = (CartDB) session.getAttribute("cart");

        Users user = (Users) session.getAttribute("user");

        try {
            int id = user.getId();
            String fullname = user.getFullName();
            String address = user.getAddress();
            String phone = user.getPhone();

            Invoice invoice = new Invoice();

            invoice.setLineCarts(cart.getItems());
            List<LineCart> line = invoice.getLineCarts();

            int prdId;
            String prdName;
            String prdQuantity;
            int prdCost;

            for (LineCart lc : line) {
                prdId = lc.getProduct().getId();
                prdName = lc.getProduct().getName();
                prdQuantity = Integer.toString(lc.getCartQuantity());
                prdCost = lc.getCartTotal();

                OrderDB orderDB = new OrderDB();
                orderDB.insertOrderLogged(id, fullname, address, phone, prdId, prdName, prdQuantity, prdCost);
            }
        } catch (NullPointerException ex) {
            System.err.println(ex);
        }

    }

    private void addOrderNoLogged(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        CartDB cart = (CartDB) session.getAttribute("cart");

        String customername = request.getParameter("customername");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        Invoice invoice = new Invoice();

        invoice.setLineCarts(cart.getItems());
        List<LineCart> line = invoice.getLineCarts();

        int prdId;
        String prdName;
        String prdQuantity;
        int prdCost;

        for (LineCart lc : line) {
            prdId = lc.getProduct().getId();
            prdName = lc.getProduct().getName();
            prdQuantity = Integer.toString(lc.getCartQuantity());
            prdCost = lc.getCartTotal();

            OrderDB orderDB = new OrderDB();
            orderDB.insertOrderNoLogged(customername, address, phone, prdId, prdName, prdQuantity, prdCost);
        }
    }
}
