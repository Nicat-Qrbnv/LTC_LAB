package Lesson23.task1;

import java.util.Comparator;

public class Product implements Comparator <Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return o1.name.compareTo(o2.name);
    }
}
