package lesson6.Task1.validators;

import java.util.regex.Pattern;

import lesson6.Task1.exceptions.IncorrectPasswordException;

public class PasswordValidator {

    private static final int MIN_PASSWORD_LENGTH = 0;
    private static final int MAX_PASSWORD_LENGTH = 20;

    public static void validatePassword(String password) throws IncorrectPasswordException {
        try {
            LengthValidator.validateLength(password, MIN_PASSWORD_LENGTH, MAX_PASSWORD_LENGTH);
            WhiteSpaceValidator.validateNoSpace(password);
            if (Pattern.matches("^[a-zA-Z]+$", password))
                    throw new IncorrectPasswordException("The password must contain at least one number");
        } catch (Exception e) {
            throw new IncorrectPasswordException(e.getMessage());
        }
    }
}
