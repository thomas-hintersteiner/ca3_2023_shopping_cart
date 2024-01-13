package at.wifi.codingacademy.shoppingcart.model;

public class ShoppingCartItem {
    protected Product product;
    protected int items;

    public ShoppingCartItem(Product product, int items) {
        this.product = product;
        this.items = items;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "product=" + product +
                ", items=" + items +
                '}';
    }
}
