package lesson22;

import java.util.Comparator;

public class Book implements Comparable <Book>{
    private final String author, name;
    private final double price;
    private final int year;

    public Book(String author, String name, double price, int year) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "%s, %s (%d). Price: %.2f".formatted(name, author, year, price);
    }
}

class BookSorter implements Comparator <Book> {

    @Override
    public int compare(Book b1, Book b2) {
        double yearComparison = Integer.compare(b1.getYear(), b2.getYear());
        double priceComparison = Double.compare(b1.getPrice(), b2.getPrice());

        return (int) ((yearComparison != 0) ? yearComparison : priceComparison);
    }
}
