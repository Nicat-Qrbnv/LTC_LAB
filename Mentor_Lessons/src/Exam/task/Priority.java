package Exam.task;

enum Priority {
    HIGH,
    MEDIUM,
    LOW;

    @Override
    public String toString() {
        return Priority.this.name().toLowerCase();
    }
}
