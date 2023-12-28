package Exam.task;

import java.util.Comparator;
import java.util.Objects;

class Task {

    static class SortTaskByPriority implements Comparator <Task> {
        @Override
        public int compare(Task o1, Task o2) {
            return o1.priority.ordinal() != o2.priority.ordinal() ?
                    o1.priority.ordinal() - o2.priority.ordinal() :
                    o1.name.compareTo(o2.name);
        }
    }

    private static int counter;
    private final int taskNum;
    private final String name;
    private final Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
        taskNum = ++counter;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return """
                Task %d : "%s", priority : "%s" """.formatted(taskNum, name, priority);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
