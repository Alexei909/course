package lesson6.Task1;

import lesson6.Task1.exceptions.IncorrectLoginException;
import lesson6.Task1.exceptions.PasswordEqualityError;
import lesson6.Task1.exceptions.IncorrectPasswordException;
import lesson6.Task1.validators.LoginValidator;
import lesson6.Task1.validators.PasswordValidator;

public class RegistrationController {

    public static boolean registration(String login, String password, String confirmPassword) {
        try {
            if (login == null) throw new IncorrectLoginException("Login cannot be null");
            if (password == null) throw new IncorrectPasswordException("Password cannot be null");
            if (confirmPassword == null) throw new IncorrectPasswordException("Confirm password cannot be null");

            LoginValidator.validateLogin(login);
            PasswordValidator.validatePassword(password);
            PasswordValidator.validatePassword(confirmPassword);

            if (!password.equals(confirmPassword))
                    throw new PasswordEqualityError("Password mismatch");
        } catch (IncorrectLoginException e) {
            System.err.println("""
                {
                    "field": "login",
                    "error": "%s"
                }""".formatted(e.getMessage()));

            return false;
        } catch (IncorrectPasswordException | PasswordEqualityError e) {
            System.err.println("""
                {
                    "field": "password",
                    "error": "%s"
                }""".formatted(e.getMessage()));

            return false;
        }

        return true;
    }
}
