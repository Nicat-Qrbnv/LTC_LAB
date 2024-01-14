package lesson27.task1;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        List <Book> books = new ArrayList<>(List.of(
            new Book("The Last Wish", "Sapkowski", 1, 1993),
            new Book("Sword of Destiny", "Sapkowski", 2, 1992),
            new Book("Blood of Elves", "Sapkowski", 3, 1994),
            new Book("Time of Contempt", "Sapkowski", 4, 1995)
        ));

        Library brdt = new Library("Biblioteca Reale di Torino");

        books.forEach(b -> brdt.addBook(b, 5));
        System.out.print (brdt);
        System.out.println ();

        System.out.println (brdt.getBook(1));
        System.out.println ();
        System.out.println (brdt.getBook(5));

    }
}
