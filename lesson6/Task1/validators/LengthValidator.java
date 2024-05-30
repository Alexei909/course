package lesson6.Task1.validators;

import lesson6.Task1.exceptions.IncorrectLengthException;

public class LengthValidator {

    public static void validateLength(String data, int min, int max) throws IncorrectLengthException {
        if (!(data.length() < max) || !(data.length() > min)) 
                throw new IncorrectLengthException(min, max);
    }
}
