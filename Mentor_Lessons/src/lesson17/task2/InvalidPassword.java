package lesson17.task2;

public class InvalidPassword extends Throwable {
    public InvalidPassword(String message) {
        super(message);
    }
}
