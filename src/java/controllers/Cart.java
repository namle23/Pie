package controllers;

import beans.Invoice;
import beans.LineCart;
import beans.Products;
import data.CartDB;
import data.ProductDB;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Cart", urlPatterns = {"/Cart"})
public class Cart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        try {
            if (action.equals("show")) {
                showCart(request, response);
                getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
            }
        } catch (NullPointerException e) {
            getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            return;
        }

        switch (action) {
            case "add":
                addProductToCart(request, response);
                request.setAttribute("addsuccess", "Add to cart successfully");
                getServletContext().getRequestDispatcher("/order.jsp").forward(request, response);
                break;
            case "remove":
                removeProductFromCart(request, response);
                getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
                break;
            case "update":
                updateProductFromCart(request, response);
                getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
                break;
            default:
                getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
                break;
        }
    }

    private void showCart(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        CartDB cart = (CartDB) session.getAttribute("cart");

        if (cart == null || cart.getCount() == 0) {
            request.setAttribute("emptyCart", "Your cart is empty!");
        } else {
            request.getSession().setAttribute("cart", cart);
        }

        java.util.Date today = new java.util.Date();

        Invoice invoice = new Invoice();
        invoice.setInvoiceDate(today);
        invoice.setLineCarts(cart.getItems());

        session.setAttribute("invoice", invoice);
    }

    private void addProductToCart(HttpServletRequest request, HttpServletResponse response) {
        String cartid = request.getParameter("cartid");

        HttpSession session = request.getSession();

        CartDB cart = (CartDB) session.getAttribute("cart");

        if (cart == null) {
            cart = new CartDB();
        }

        Products product = ProductDB.selectProduct(cartid);

        if (product != null) {
            LineCart lineCart = new LineCart();
            lineCart.setProduct(product);
            cart.addItem(lineCart);
        }
        session.setAttribute("cart", cart);
    }

    private void removeProductFromCart(HttpServletRequest request, HttpServletResponse response) {
        String cartid = request.getParameter("cartid");

        HttpSession session = request.getSession();

        CartDB cart = (CartDB) session.getAttribute("cart");

        Products product = ProductDB.selectProduct(cartid);

        if (product != null && cart != null) {
            LineCart lineCart = new LineCart();
            lineCart.setProduct(product);
            cart.removeItem(lineCart);
        }
    }

    private void updateProductFromCart(HttpServletRequest request, HttpServletResponse response) {
        String cartid = request.getParameter("cartid");
        String quantityString = request.getParameter("quantity");

        HttpSession session = request.getSession();

        CartDB cart = (CartDB) session.getAttribute("cart");
        int quantity;
        try {
            quantity = Integer.parseInt(quantityString);
            if (quantity < 0) {
                quantity = 1;
            }
        } catch (NumberFormatException e) {
            quantity = 1;
        }

        Products product = ProductDB.selectProduct(cartid);
        if (product != null && cart != null) {
            LineCart lineCart = new LineCart();
            lineCart.setProduct(product);
            lineCart.setCartQuantity(quantity);
            if (quantity > 0) {
                cart.removeItem(lineCart);
                cart.addItem(lineCart);
            } else {
                cart.removeItem(lineCart);
            }
        }
    }
}
