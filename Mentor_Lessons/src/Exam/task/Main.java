package Exam.task;

import java.util.List;

class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Add 5 to 4", Priority.LOW);
        Task t2 = new Task("Divide 6 to 2", Priority.MEDIUM);
        Task t3 = new Task("Find area of a shape", Priority.HIGH);
        Task t4 = new Task("Add 5 to 4", Priority.HIGH);
        Task t5 = new Task("Add 10 to 4", Priority.MEDIUM);
        Task t6 = new Task("Find GCD of 49 and 14", Priority.HIGH);

        TaskManager tasker = new TaskManager();

            tasker.addTask(t1);

            tasker.addTask(t2);

            tasker.addTask(t3);

            tasker.addTask(t4);

            tasker.addTask(t5);

            tasker.addTask(t6);

        System.out.println (tasker);

            tasker.removeTask(t1);

            tasker.removeTask(new Task("Arbitrary task", Priority.LOW));

        System.out.println ();
        tasker.printByPriority(Priority.HIGH);
        tasker.printByPriority(Priority.MEDIUM);
        tasker.printByPriority(Priority.LOW);
    }
}
