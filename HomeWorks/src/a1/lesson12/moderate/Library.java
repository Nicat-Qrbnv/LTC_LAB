package a1.lesson12.moderate;

import java.util.Arrays;

public class Library {
    private String name;
    private Book[] bookCollection;
    private static int numOfMembers;

    public Library(String name, Book[] bookCollection) {
        this.name = name;
        this.bookCollection = bookCollection;
    }

    public Library (String name) {
        this (name, new Book[1]);
        Arrays.sort (bookCollection);
    }

    public void addBook (Book b) {
        if (bookCollection[0] == null) {
            bookCollection[0] = b;
        } else {
            boolean bookExists = false;
            for (Book item : bookCollection) {
                if (item.equals(b)) {
                    bookExists = true;
                }
            }
            if (bookExists) {
                System.out.println("Book exists");
            } else {
                bookCollection = Arrays.copyOf(bookCollection, bookCollection.length + 1);
                bookCollection[bookCollection.length - 1] = b;
            }
        }
    }

    public String getBookCollectionList () {
        String s = "";
        int count = 1;
        for (Book item : bookCollection) {
            s += count + ". " + item.toString() + "\n";
            count++;
        }
        return s;
    }
    @Override
    public String toString() {
        return "Library name: " + name + "\nBookCollection : \n" + getBookCollectionList();
    }

    public Book[] getBookCollection() {
        return bookCollection;
    }
}
