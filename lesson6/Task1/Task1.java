package lesson6.Task1;

public class Task1 {

    public static void main(String[] args) {
        boolean result = RegistrationController
                .registration("qwerty123", "qwerty123", "qwerty123");
        System.out.println("Результат корректно введенных данных: " + result);
        System.out.println();

        boolean incorrectLoginLength = RegistrationController
                .registration("qqqqqqqqqqqqqqqqqqqq", "qwerty123", "qwerty123");
        System.out.println("Результат при длине логина > 20: " + incorrectLoginLength);
        System.out.println();

        boolean LoginContainsSpaces = RegistrationController
                .registration(" qqqqqqqqqqq", "qwerty123", "qwerty123");
        System.out.println("Результат при пробельных символах в логине: " + LoginContainsSpaces);
        System.out.println();

        boolean incorrectPasswordLength = RegistrationController
                .registration("qqqq", "qqqqqqqqqqqqqq1qqqqq", "qwerty123");
        System.out.println("Результат при длине пароля > 20: " + incorrectPasswordLength);
        System.out.println();

        boolean PasswordContainsSpaces = RegistrationController
                .registration("qqqq", "qqqqqqqqq q1", "qwerty123");
        System.out.println("Результат при пробельных символах в пароле: " + PasswordContainsSpaces);
        System.out.println();

        boolean incorrectPasswordNotContainsDigit = RegistrationController
                .registration("qqqq", "qqqqqqqqqq", "qwerty123");
        System.out.println("Результат при отсутствия цифр в пароле: " + incorrectPasswordNotContainsDigit);
        System.out.println();

        boolean passwordMismatch = RegistrationController
                .registration("qqqq", "qwerty12", "qwerty123");
        System.out.println("Результат при несовпадении паролей: " + passwordMismatch);
        System.out.println();

        boolean nullData = RegistrationController
                .registration(null, null, null);
        System.out.println("Результат при null: " + nullData);
        System.out.println();
    }
}
