package Lesson24.exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Amil", "Q.", 50);
        Student s2 = new Student("Kamil", "S.", 70);
        Student s3 = new Student("Famil", "T.", 64);
        Student s4 = new Student("Ramil", "Q.", 99);
        Student s5 = new Student("Qabil", "G.", 88);

        ArrayList <Student> students = new ArrayList<>();
        students.add(s4);
        students.add(s3);
        students.add(s2);
        students.add(s1);
        students.add(s5);

        students.sort(new Student());

        for (Student s : students) {
            System.out.println(s);
        }

    }
}
