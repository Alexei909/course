package lesson6.Task1.exceptions;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
