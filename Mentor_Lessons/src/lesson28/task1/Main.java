package lesson28.task1;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Computer Science", "John");
        Student s2 = new Student(2, "Computer Science", "Jane");
        Student s3 = new Student(3, "Physics", "Alice");
        Student s4 = new Student(4, "Physics", "Bob");
        Student s5 = new Student(5, "Economics", "John");
        Student s6 = new Student(6, "Economics", "Michael");
        Student s7 = new Student(7, "Mathematics", "Michael");
        Student s8 = new Student(8, "Petroleum Eng", "Daniel");
        Student s9 = new Student(9, "Petroleum Eng", "John");
        Student s10 = new Student(10, "Petroleum Eng", "Alice");

        StudentRecordSystem srs = new StudentRecordSystem();

        srs.addStudents(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
        System.out.println ();

        System.out.println (srs);

        srs.removeStudent(s2);
        System.out.println ();

        srs.addStudents(s2);
        System.out.println ();

        srs.searchStudentsBy("name", "Petroleum Eng");
    }
}
