package lesson6.Task1.exceptions;

public class LengthException extends Exception {

    public LengthException(int min, int max) {
        super("The length of the line must be from %s to %s."
                .formatted(min, max));
    }
}
