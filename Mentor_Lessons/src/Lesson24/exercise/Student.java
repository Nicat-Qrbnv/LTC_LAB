package Lesson24.exercise;

import java.util.Comparator;

public class Student implements Comparator <Student> {
    private static int lastID = 1000;
    private final int ID;
    private final String name;
    private final String surname;
    private final int grade;

    public Student() {
        ID = 0;
        name = null;
        surname = null;
        grade = 0;
    }

    public Student(String name, String surname, int grade) {
        this.ID = ++lastID;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.ID - o2.ID;
    }



    @Override
    public String toString() {
        return "%d | %s %5s | %d".formatted(ID, surname, name, grade);
    }
}
