package prjcts.P2_Library;

import java.util.Objects;

public class Book {
    private final String title, author;
    private final int iSBN, publcYear;

    public Book(String title, String author, int iSBN, int publcYear) {
        this.title = title;
        this.author = author;
        this.iSBN = iSBN;
        this.publcYear = publcYear;
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
        return "%-35s ISBN: %04d".formatted( "%s, %s (%d).".formatted(title, author, publcYear), iSBN);
    }
}
