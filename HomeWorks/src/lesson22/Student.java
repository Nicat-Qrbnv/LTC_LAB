package lesson22;

import java.util.Comparator;

public class Student {
    private final String name, surname;
    private final int age, grade;

    public Student(String name, String surname, int age, int grade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "%s %s (%d). Grade: %d".formatted(surname, name, age, grade);
    }
}

class SortStudentBySurname implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getSurname().compareTo(s2.getSurname());
    }
}

class SortStudentByName implements Comparator <Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class SortStudentByAge implements Comparator <Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

class SortStudentByGrade implements Comparator <Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getGrade(), s2.getGrade());
    }
}