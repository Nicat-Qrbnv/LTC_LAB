package a1.lesson12.moderate;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int iSBN;
    private int publication_year;

    public Book(String title, String author, int iSBN, int publication_year) {
        this.title = title;
        this.author = author;
        this.iSBN = iSBN;
        this.publication_year = publication_year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return iSBN == book.iSBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iSBN);
    }

    @Override
    public String toString() {
        return title + " by " + author + ". " + String.format("ISBN: %04d", iSBN) + ", " + publication_year;
    }
}
