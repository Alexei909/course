package lesson6.Task1.exceptions;

public class IncorrectLengthException extends Exception {

    public IncorrectLengthException(int min, int max) {
        super("The length of the string must be from %s to %s."
                .formatted(min, max));
    }
}
