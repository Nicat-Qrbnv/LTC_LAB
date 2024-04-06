package hack.sol2;

import java.util.*;

class Priorities implements Comparator<Student> {
    PriorityQueue<Student> pQ = new PriorityQueue<>(this);
    public List<Student> getStudents(List<String> events) {
        for (String e : events) {
            Scanner sc = new Scanner(e);
            String event = sc.next();
            if (event.equals("ENTER")) {
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();
                Student student = new Student(id, name, cgpa);
                pQ.add(student);
            } else if (event.equals("SERVED")) {
                pQ.poll();
            }
        }
        ArrayList<Student> a = new ArrayList<>();
        while (!pQ.isEmpty()) {
            a.add(pQ.poll());
        }
        return a;
    }

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getCgpa() != student2.getCgpa()) {
            if (student1.getCgpa() > student2.getCgpa())
                return -1;
            else
                return 1;
        } else {
            if ((student1.getName().compareTo(student2.getName())) != 0) {
                return student1.getName().compareTo(student2.getName());
            } else {
                return student1.getId() - student2.getId();
            }
        }
    }
}