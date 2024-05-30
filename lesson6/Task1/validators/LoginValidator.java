package lesson6.Task1.validators;

import lesson6.Task1.exceptions.IncorrectLoginException;

public class LoginValidator {

    private static final int MIN_LOGIN_LENGTH = 0;
    private static final int MAX_LOGIN_LENGTH = 20;

    public static void validateLogin(String login) throws IncorrectLoginException {
        try {
            LengthValidator.validateLength(login, MIN_LOGIN_LENGTH, MAX_LOGIN_LENGTH);
            WhiteSpaceValidator.validateNoSpace(login);
        } catch (Exception e) {
            throw new IncorrectLoginException(e.getMessage());
        }
    }
}
