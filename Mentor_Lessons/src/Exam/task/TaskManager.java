package Exam.task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class TaskManager {
    private final LinkedList<Task> tasks = new LinkedList<>();

    public TaskManager() {
    }

    public void addTask(Task t) {
        try {
            if (!tasks.contains(t)) {
                tasks.add(t);
            } else {
                throw new DuplicateTaskException("Task already exists!: " + t.toString());
            }
        } catch (DuplicateTaskException e) {
            System.out.println(e.getMessage());
        }
    }

    public String removeTask(Task t) {
        try {
            boolean found = tasks.remove(t);
            if (!found) {
                throw new TaskNotFoundException("Task is not found!: " + t.toString());
            }
        } catch (TaskNotFoundException e) {
            System.out.println (e.getMessage());
        }
        return "Successful task removal --> " + t.toString();
    }

    public void printByPriority(Priority p) {
        StringBuilder output = new StringBuilder("Tasks of %s priority\n".formatted(p));
        for (Task t : tasks) {
            if (t.getPriority().equals(p)) {
                output.append(t.toString().indent(4));
            }
        }
        System.out.println(output);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Tasks:\n");
        tasks.forEach(t -> output.append(t.toString().indent(4)));
        return output.toString();
    }
}
