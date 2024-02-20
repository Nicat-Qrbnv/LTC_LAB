package prjcts.p2_library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Book> books = new ArrayList<>(List.of(
            new Book("The Last Wish", "Sapkowski", 1, 1993),
            new Book("Sword of Destiny", "Sapkowski", 2, 1992),
            new Book("Blood of Elves", "Sapkowski", 3, 1994),
            new Book("Time of Contempt", "Sapkowski", 4, 1995)
        ));

        books.forEach(System.out::println);
        System.out.println ();

        Library brdt = new Library("Biblioteca Reale di Torino");

        books.forEach(b -> brdt.addBook(b, 5));
        System.out.print (brdt);
        System.out.println ();

        Member mem1 = new Member("Nicat", 1);
        brdt.addMember(mem1);
        mem1.borrowBook(brdt, books.get(0));
        mem1.getBorrowedList();
        System.out.println ();


    }
}
