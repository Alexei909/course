package lesson6.Task1.validators;

import java.util.regex.Pattern;

import lesson6.Task1.exceptions.LengthException;
import lesson6.Task1.exceptions.SpaceException;
import lesson6.Task1.exceptions.WrongPasswordException;

public class PasswordValidator {

    private static final int MIN_PASSWORD_LENGTH = 0;
    private static final int MAX_PASSWORD_LENGTH = 20;

    public static void validatePassword(String password) throws WrongPasswordException {
        try {
            LengthValidator.validateLength(password, MIN_PASSWORD_LENGTH, MAX_PASSWORD_LENGTH);
            SpaceValidator.validateNoSpace(password);
            if (Pattern.matches("^[a-zA-Z]+$", password))
                    throw new WrongPasswordException("The password must contain at least one number");
        } catch (LengthException e) {
            throw new WrongPasswordException("Incorrect password", e);
        } catch (SpaceException e) {
            throw new WrongPasswordException("Incorrect password", e);
        }
    }
}
