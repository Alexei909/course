package lesson6.Task1.exceptions;

public class WhiteSpaceException extends Exception {

    public WhiteSpaceException() {
        super("The string must not contain whitespace characters.");
    }
}
