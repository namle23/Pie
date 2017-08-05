package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utils.CartAction;

@WebServlet(name = "Cart", urlPatterns = {"/Cart"})
public class Cart extends HttpServlet {

    private static final String defaultURL = "/cart.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("add")) {

        }
    }

    private String showCart(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        CartAction cartAction = (CartAction) session.getAttribute("cart");

        if (cartAction == null || cartAction.getCount() == 0) {
            request.setAttribute("emptyCart", "Cart is empty");
        } else {
            request.getSession().setAttribute("cart", cartAction);
        }
        return defaultURL;
    }

    private String addItem(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        CartAction cartAction = (CartAction) session.getAttribute("cart");

        if (cartAction == null) {
            cartAction = new CartAction();
        }
        String prdId = request.getParameter("cartid");

    }
}
