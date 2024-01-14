package lesson28.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentGradeTracker sgt = new StudentGradeTracker();

        sgt.addStudent("John");
        sgt.addStudent("Jane");
        sgt.addStudent("Bob");
        sgt.addStudent("Alice");
        sgt.addStudent("Charlie");
        sgt.addStudent("Eva");
        sgt.addStudent("David");
        sgt.addStudent("Sophia");
        sgt.addStudent("Daniel");
        sgt.addStudent("Olivia");
        System.out.println ();

        sgt.addGrade("John", 90);
        sgt.addGrade("Jane", 85);
        sgt.addGrade("Bob", 75);
        sgt.addGrade("Alice", 92);
        sgt.addGrade("Charlie", 88);
        sgt.addGrade("Eva", 78);
        sgt.addGrade("David", 95);
        sgt.addGrade("Sophia", 87);
        sgt.addGrade("Daniel", 93);
        sgt.addGrade("Olivia", 80);
        System.out.println ();

        System.out.println (sgt);

        List<String> student = new ArrayList<>();


    }
}
