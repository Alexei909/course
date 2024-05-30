package lesson6.Task1.exceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
