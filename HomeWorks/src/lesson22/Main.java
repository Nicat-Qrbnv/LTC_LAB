package lesson22;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        bookTask();

        studentTask();

    }
    static void bookTask () {
        Book b1 = new Book("Edgard Allan Poe", "The Black Cat", 25, 1843);
        Book b2 = new Book("The Last Wish", "Andrzej Sapkowski", 20, 1993);
        Book b3 = new Book("The Hound of the Baskervilles", "Arthur Conan Doyle", 10, 1902);
        Book b4 = new Book("A Tale of Two Cities", "Charles Dickens", 17, 1859);
        Book b5 = new Book("The Tower of the Swallow", "Andrzej Sapkowski", 33, 1997);

        ArrayList<Book> bookShelf = new ArrayList<>(List.of(b1, b2, b3, b4, b5));
        Collections.sort(bookShelf);
        for (Book b : bookShelf) {
            System.out.println (b);
        }
        System.out.println ();

        bookShelf.sort(new BookSorter());
        for (Book b : bookShelf) {
            System.out.println (b);
        }
        System.out.println ();
    }

    static void studentTask () {
        Student s1 = new Student("Amil", "B.", 20, 50);
        Student s2 = new Student("Kamil", "S.", 22, 70);
        Student s3 = new Student("Famil", "T.", 30, 64);
        Student s4 = new Student("Ramil", "A.", 19, 99);
        Student s5 = new Student("Qabil", "G.", 25,88);

        ArrayList<Student> students = new ArrayList<>(Set.of(s1, s2, s3, s4, s5));

        students.sort(new SortStudentByName());
        System.out.println ("Sorted by Name:");
        for (Student s : students) {
            System.out.println (s);
        }
        System.out.println ();

        students.sort(new SortStudentBySurname());
        System.out.println ("Sorted by Surname:");
        for (Student s : students) {
            System.out.println (s);
        }
        System.out.println ();

        students.sort(new SortStudentByAge());
        System.out.println ("Sorted by Age:");
        for (Student s : students) {
            System.out.println (s);
        }
        System.out.println ();

        students.sort(new SortStudentByGrade());
        System.out.println ("Sorted by Grade:");
        for (Student s : students) {
            System.out.println (s);
        }
    }

}
