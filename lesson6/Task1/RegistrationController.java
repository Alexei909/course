package lesson6.Task1;

import lesson6.Task1.exceptions.PasswordEqualityError;
import lesson6.Task1.exceptions.WrongLoginException;
import lesson6.Task1.exceptions.WrongPasswordException;
import lesson6.Task1.validators.LoginValidator;
import lesson6.Task1.validators.PasswordValidator;

public class RegistrationController {

    public static boolean registration(String login, String password, String confirmPassword) {
        try {
            if (login == null) throw new WrongLoginException("Login cannot be null");
            if (password == null) throw new WrongPasswordException("Password cannot be null");
            if (confirmPassword == null) throw new WrongPasswordException("Confirm password cannot be null");

            LoginValidator.validateLogin(login);
            PasswordValidator.validatePassword(password);
            PasswordValidator.validatePassword(confirmPassword);

            if (!password.equals(confirmPassword))
                    throw new PasswordEqualityError("Password mismatch");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            if (e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }

            return false;
        }

        return true;
    }
}
