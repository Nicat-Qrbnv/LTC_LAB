package lesson27.task1;

class BookNotFoundException extends Throwable {
    public BookNotFoundException(String message) {
        super(message);
    }
}
