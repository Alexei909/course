package lesson6.Task1.exceptions;

public class SpaceException extends Exception {

    public SpaceException() {
        super("The string must not contain whitespace characters.");
    }
}
