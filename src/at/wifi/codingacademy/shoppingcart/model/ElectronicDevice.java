package at.wifi.codingacademy.shoppingcart.model;

public class ElectronicDevice extends Product {
    protected int neededPower;
    protected boolean hasBatteryPack;

    public ElectronicDevice(String productNumber, String name, double price, int stockItems, int neededPower, boolean hasBatteryPack) {
        super(productNumber, name, price, stockItems);
        this.neededPower = neededPower;
        this.hasBatteryPack = hasBatteryPack;
    }

    public int getNeededPower() {
        return neededPower;
    }

    public void setNeededPower(int neededPower) {
        this.neededPower = neededPower;
    }

    public boolean hasBatteryPack() {
        return hasBatteryPack;
    }

    public void setHasBatteryPack(boolean hasBatteryPack) {
        this.hasBatteryPack = hasBatteryPack;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "neededPower=" + neededPower +
                ", hasBatteryPack=" + hasBatteryPack +
                ", productNumber='" + productNumber + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockItems=" + stockItems +
                '}';
    }
}
