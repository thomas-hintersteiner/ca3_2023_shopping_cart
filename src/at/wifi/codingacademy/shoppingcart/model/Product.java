package at.wifi.codingacademy.shoppingcart.model;

public class Product {
    // Attribute
    protected String productNumber;
    protected String name;
    protected double price;
    protected int stockItems;

    // Konstruktor
    public Product(String productNumber, String name, double price, int stockItems) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.stockItems = stockItems;
    }

    // Methoden
    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockItems() {
        return stockItems;
    }

    public void setStockItems(int stockItems) {
        this.stockItems = stockItems;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber='" + productNumber + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockItems=" + stockItems +
                '}';
    }
}
