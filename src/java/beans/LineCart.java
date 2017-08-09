package beans;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

public class LineCart implements Serializable {

    private String cartId;
    private int cartQuantity = 1;
    private Products product;

    public LineCart() {
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public int getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public int getCartTotal() {
        int cartTotal = product.getPrice() * getCartQuantity();
        return cartTotal;
    }

    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return currency.format(this.getCartTotal());
    }
}
