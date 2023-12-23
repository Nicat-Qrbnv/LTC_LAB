package Lesson23.task1;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final String customer;
    private final HashMap <Product, Double> items = new HashMap<>();

    public ShoppingCart(String customer) {
        this.customer = customer;
    }

    public void addItem (Product item, Double amount) {
        items.put(item, amount);
    }

    @Override
    public String toString() {

        StringBuilder receipt = new StringBuilder ("%s%n%-10s | %-6s | %-6s%n".formatted(customer, "Item", "Amount", "Price"));

        double totalPrice = 0;

        for (Map.Entry <Product, Double> entry : items.entrySet()) {

            String item = entry.getKey().getName();
            double amount = entry.getValue();
            double productPrice = amount * entry.getKey().getPrice();
            receipt.append("%-10s | %-6.2f | %-6.2f%n".formatted(item, amount, productPrice));

            totalPrice += productPrice;
        }

        receipt.append("%26.2f".formatted(totalPrice));

        return String.valueOf(receipt);
    }
}
