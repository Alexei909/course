package lesson6.Task1.validators;

import lesson6.Task1.exceptions.LengthException;
import lesson6.Task1.exceptions.SpaceException;
import lesson6.Task1.exceptions.WrongLoginException;

public class LoginValidator {

    private static final int MIN_LOGIN_LENGTH = 0;
    private static final int MAX_LOGIN_LENGTH = 20;

    public static void validateLogin(String login) throws WrongLoginException {
        try {
            LengthValidator.validateLength(login, MIN_LOGIN_LENGTH, MAX_LOGIN_LENGTH);
            SpaceValidator.validateNoSpace(login);
        } catch (LengthException e) {
            throw new WrongLoginException("Incorrect login", e);
        } catch (SpaceException e) {
            throw new WrongLoginException("Incorrect login", e);
        }
    }
}
