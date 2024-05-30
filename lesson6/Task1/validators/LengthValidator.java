package lesson6.Task1.validators;

import lesson6.Task1.exceptions.LengthException;

public class LengthValidator {

    public static void validateLength(String data, int min, int max) throws LengthException {
        if (!(data.length() < max) || !(data.length() > min)) 
                throw new LengthException(min, max);
    }
}
