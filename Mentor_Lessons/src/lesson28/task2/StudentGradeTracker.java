package lesson28.task2;

import java.util.HashMap;

public class StudentGradeTracker {
    private final HashMap<String, Integer> studentgrades = new HashMap<>();

    public void addStudent (String name) {
        boolean exists = studentgrades.put(name, 0) != null;
        System.out.println (name + (exists ? " exists!" : " is added!"));
    }

    public void addGrade (String name, int grade) {
        studentgrades.replace(name, grade);
        System.out.printf("%s got %d%n", name, grade);
    }

    public String getStudentGrade (String name) {
        return "%-7s -- %d".formatted (name, studentgrades.get(name));
    }

    public String getClassAverage () {
        double average = studentgrades.values().stream().mapToDouble(g -> g).average().getAsDouble();
        return ("The class average is: " + average);
    }

    @Override
    public String toString() {

        StringBuilder list = new StringBuilder("The class results:\n");

        studentgrades.forEach((s, g) -> list.append(getStudentGrade(s).indent(4)));
        list.append(getClassAverage());

        return list.toString();
    }
}
