package lesson27.task1;

import java.util.HashMap;
import java.util.Map;

public class Library {


    //fields

    private final String name;
    private final HashMap<Book, Integer> books = new HashMap<>();

    //constructor

    public Library (String name) {
        this.name = name;
    }


    //getters

    public Book getBook (int ISBN) {

        try {
            for (Map.Entry<Book, Integer> book : books.entrySet()) {
                if (book.getKey().equals(new Book(ISBN))) {
                    return book.getKey();
                } else {
                    throw new BookNotFoundException("Book with %d ISBN not found! ".formatted(ISBN));
                }
            }
        } catch (BookNotFoundException e) {
            System.out.print (e.getMessage());
        }
        return null;
    }

    public HashMap<Book, Integer> getAllBooks() {
        return books;
    }

    //other methods

    public void addBook (Book b, int amount) {

        books.put(b, books.get(b) == null ? amount : books.get(b) + amount);

    }

    public StringBuilder getBookCollectionList () {
        StringBuilder str = new StringBuilder();
        books.forEach( (key, value) -> str.append (("%s. Amount: %d.".formatted(key, value)).indent(4)) );
        return str;
    }

    @Override
    public String toString() {
        return "Library name: " + name + "\n  Books:\n" + getBookCollectionList();
    }
}
