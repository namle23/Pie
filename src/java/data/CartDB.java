package data;

import beans.LineCart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartDB implements Serializable {

    private List<LineCart> items;

    public CartDB() {
        items = new ArrayList<>();
    }

    public void setItems(List<LineCart> lineCarts) {
        items = lineCarts;
    }

    public List<LineCart> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(LineCart cart) {
        String cartid = cart.getProduct().getId().toString();
        int quantity = cart.getCartQuantity();

        for (LineCart lineCart : items) {
            if (lineCart.getProduct().getId().equals(cartid)) {
                lineCart.setCartQuantity(quantity);
                return;
            }
        }
        items.add(cart);
    }

    public void removeItem(LineCart cart) {
        String cartid = cart.getProduct().getId().toString();

        for (int i = 0; i < items.size(); i++) {
            LineCart lineCart = items.get(i);

            if (lineCart.getProduct().getId().toString().equals(cartid)) {
                items.remove(i);
                return;
            }
        }
    }
}
