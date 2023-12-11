package lesson20.normal;

public class Task {
    private final String message;

    public Task(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
