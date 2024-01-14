package lesson27.task1;

import java.util.Objects;

public class Book {

    //fields
    private final String title, author;
    private final int ISBN, publcYear;

    //constructors
    public Book(int ISBN) {
        this.ISBN = ISBN;
        title = null; author = null; publcYear = 0;
    }

    public Book(String title, String author, int ISBN, int publcYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publcYear = publcYear;
    }

    //methods
    @Override
    public String toString() {
        return "%-35s ISBN: %04d".formatted( "%s, %s (%d).".formatted(title, author, publcYear), ISBN);
    }

    //Hashing
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return ISBN == book.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
