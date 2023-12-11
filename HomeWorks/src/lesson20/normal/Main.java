package lesson20.normal;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Pair p1 = new Pair<>(1, 2);
        Pair p2 = new Pair<>("a", "b");

        Number n1 = 2.6;
        Number n2 = 3.9;
        Pair p3 = new Pair<>(n1, n2);

        System.out.println(p1.getPair());
        System.out.println(p2.getPair());
        System.out.println(p3.getPair());

        System.out.println ("-".repeat(20));

        ArrayList <?> frt = new ArrayList<>(List.of ("zoğal", "limon", "alça"));
        System.out.println (frt);

        System.out.println ("-".repeat(20));

        HashSet <Integer> nums = new HashSet<>();

        nums.add(2);
        nums.add(5);
        nums.add(2);
        nums.add(-1);

        System.out.println (nums);

        System.out.println ("-".repeat(20));

        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");
        Task t3 = new Task("Task 3");

        Queue <Task> taskQueue = new LinkedList <> ();
        taskQueue.offer(t1);
        taskQueue.offer(t2);
        taskQueue.offer(t3);

        Iterator <Task> iterator = taskQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println (iterator.next());
        }
    }
}
