package at.wifi.codingacademy.shoppingcart;

import at.wifi.codingacademy.shoppingcart.model.*;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();

        ElectronicDevice tv = new ElectronicDevice("SAM55X", "Samsung X-Series 55 Zoll", 999.99, 10, 100, false);
        ElectronicDevice pixel = new ElectronicDevice("PIX8PRO", "Google Pixel 8 Pro", 1200.00, 5, 50, true);

        Food apple = new Food("GS1234", "Granny Smith", 1, 100, new Date(2024,2,1), 54, FoodCategory.FRUITS, true, true);
        Food pizza = new Food("PZ2222", "Provenziale", 9.99, 20, new Date(2025,1,1), 700);

        sc.addItem(new ShoppingCartItem(tv, 1));
        sc.addItem(new ShoppingCartItem(pixel, 2));
        sc.addItem(new ShoppingCartItem(apple, 5));

        System.out.println(tv);
        System.out.println(pixel);
        System.out.println(apple);
        System.out.println(pizza);

        System.out.println(sc);
        System.out.println("Anzahl an Produkten: " + sc.getNumberOfCartItems());
        System.out.println("Gesamtpreis: " + sc.getTotalPrice());

    }

}
