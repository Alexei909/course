package lesson6.Task1.exceptions;

public class PasswordEqualityError extends Exception{

    public PasswordEqualityError(String message) {
        super(message);
    }
}