package utils;

import beans.Orders;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartAction implements Serializable {

    private List<Orders> items;

    public CartAction() {
        items = new ArrayList<>();
    }

    public void setItems(List<Orders> orderItems) {
        items = orderItems;
    }

    public List<Orders> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(Orders order) {
        String prdId = order.getProduct().getId().toString();
        int quantity = order.getPrdQuan();

        for (Orders orders : items) {
            if (orders.getProduct().getId().toString().equals(prdId)) {
                orders.setPrdQuan(quantity);
                return;
            }
        }
    }

    public void removeItem(Orders order) {
        String prdId = order.getProduct().getId().toString();

        for (int i = 0; i < items.size(); i++) {
            Orders orders = items.get(i);

            if (orders.getProduct().getId().toString().equals(prdId)) {
                items.remove(i);
                return;
            }
        }
    }
}
