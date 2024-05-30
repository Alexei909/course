package lesson6.Task1.exceptions;

public class IncorrectLoginException extends Exception {

    public IncorrectLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectLoginException(String message) {
        super(message);
    }
}
