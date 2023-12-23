package Prj2_Library;

import java.util.HashMap;
import java.util.HashSet;

public class Library {


    //fields

    private final String name;
    private final HashMap<Book, Integer> books = new HashMap<>();
    private final HashSet<Member> members = new HashSet<>();


    //constructor

    public Library (String name) {
        this.name = name;
    }


    //getters

    public HashMap<Book, Integer> getBooks() {
        return books;
    }

    public HashSet<Member> getMembers() {
        return members;
    }


    //other methods

    public void addBook (Book b, int amount) {

        books.put(b, books.get(b) == null ? amount : books.get(b) + amount);

    }

    public void addMember (Member member) {
        String message = members.add(member) ? (member + " is succesfully added!") : "Member exists!";
        System.out.println (message);
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
