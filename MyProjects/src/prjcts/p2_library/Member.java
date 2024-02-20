package prjcts.p2_library;

import java.util.HashSet;
import java.util.Objects;

public class Member {
    private final String name;
    private final int ID;
    private final HashSet<Book> borrowedBooks = new HashSet<>();

    public Member(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void borrowBook (Library lib, Book b) {

        if (lib.getMembers().contains(this)) {

            if (!borrowedBooks.contains(b)) {

                if (lib.getBooks().get(b) > 0) {

                    borrowedBooks.add(b);
                    lib.getBooks().put(b, lib.getBooks().get(b) - 1);

                } else {
                    System.out.println("Library doesn't have the book!");
                }

            } else {
                System.out.println ("You have already borrowed the book!");
            }

        } else {
            System.out.println ("Member with this ID is not found!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return ID == member.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public void getBorrowedList () {
        StringBuilder str = new StringBuilder("Borrowed books:\n".indent(2));
        borrowedBooks.forEach( book -> str.append( book.toString().indent(4) ) );
        System.out.print (str);
    }

    @Override
    public String toString() {
        return "%s (%04d)".formatted(name, ID);
    }


}
