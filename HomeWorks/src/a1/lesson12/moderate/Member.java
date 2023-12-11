package a1.lesson12.moderate;

import java.util.Arrays;

public class Member {
    private String name;
    private String iD;
    private Book[] borrowed = new Book[1];

    public Member(String name, int iD) {
        this.name = name;
        this.iD = String.format("M%04d", iD);
    }

    public void borrowBook (Library lib, Book b) {
        boolean bookInLib = false;
        for (Book item : lib.getBookCollection()) {
            if (item.equals(b)) {
                bookInLib = true;
            }
        }
        if (bookInLib) {
            if (borrowed[0] == null) {
                borrowed[0] = b;
            } else {
                boolean bookExists = false;
                for (Book item : borrowed) {
                    if (item.equals(b)) {
                        bookExists = true;
                    }
                }
                if (bookExists) {
                    System.out.println("Book exists");
                } else {
                    borrowed = Arrays.copyOf(borrowed, borrowed.length + 1);
                    borrowed[borrowed.length - 1] = b;
                }
            }
        } else {
            System.out.println ("Library does not have the book!");
        }
    }

    @Override
    public String toString() {
        return name + "   ID: " + iD + "\n" + "Borrowed books:\n" + getBorrowedList();
    }

    public String getBorrowedList () {
        String s = "";
        int count = 1;
        for (Book item : borrowed) {
            s += count + ". " + item.toString() + "\n";
            count++;
        }
        return s;
    }
}
