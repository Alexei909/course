package lesson6.Task1.exceptions;

public class IncorrectPasswordException extends Exception {

    public IncorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectPasswordException(String message) {
        super(message);
    }
}
