package at.wifi.codingacademy.shoppingcart.model;

import java.util.ArrayList;

public class ShoppingCart {
    protected ArrayList<ShoppingCartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<ShoppingCartItem>();
    }

    public ArrayList<ShoppingCartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ShoppingCartItem> items) {
        this.items = items;
    }

    public void addItem(ShoppingCartItem item) {
        this.items.add(item);
    }

    public void removeItem(ShoppingCartItem item) {
        this.items.remove(item);
    }

    public double getTotalPrice() {
        double total = 0.0;

//        for (Object obj : this.items) {
//            if (obj instanceof ShoppingCartItem) {
//                ShoppingCartItem item = (ShoppingCartItem) obj;
//                total += item.getProduct().getPrice() * item.getItems();
//            }
//        }
        for (ShoppingCartItem item : this.items) {
            total += item.getProduct().getPrice() * item.getItems();
        }

        return total;
    }

    public int getNumberOfCartItems() {
        int numberOfCartItems = 0;

        for (ShoppingCartItem item : this.items) {
            numberOfCartItems += item.getItems();
        }

        return numberOfCartItems;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
