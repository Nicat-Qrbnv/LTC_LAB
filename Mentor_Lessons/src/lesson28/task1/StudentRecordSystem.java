package lesson28.task1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;

public class StudentRecordSystem {

    private final HashSet<Student> students = new HashSet<>();

    public void addStudents (Student... ss) {
        for (Student s : ss) {
            boolean added = students.add(s);
            System.out.println(s.name() + (added ? " is added!" : " exists!"));
        }
    }

    public void removeStudent (Student s) {
        boolean removed = students.remove(s);
        System.out.println ( s.name() + (removed ? " is removed!" : " does not exist!") );
    }

    public String ListToString (List<Student> sts) {
        StringBuilder list = new StringBuilder("Students Record:\n");

        sts.stream ()
                .sorted (Comparator.comparing(Student::id))
                .forEach ( s -> list.append( s.toString().indent(4) ) );

        return list.toString();
    }

    public void searchStudentsBy (String filter, String input) {

        Function<String, List<Student>> nameFilterer =
                n -> students.stream().filter(s -> s.name().equals(n)).toList();

        Function<String, List<Student>> departmentFilterer =
                d -> students.stream().filter(s -> s.department().equals(d)).toList();

        String output = switch (filter.toUpperCase()) {
            case "NAME" -> ListToString(nameFilterer.apply(input));
            case "DEPARTMENT" -> ListToString(departmentFilterer.apply(input));
            default -> "";
        };

        if (output.isEmpty()) {
            System.out.println ("Unsupported filter!");
        } else if (output.substring(16).isBlank()) {
            System.out.println ("No matches found!");
        } else {
            System.out.println (output);
        }
    }

    @Override
    public String toString() {
        return ListToString(students.stream().toList());
    }
}
