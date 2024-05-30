package lesson6.Task1.validators;

import lesson6.Task1.exceptions.SpaceException;

public class SpaceValidator {

    public static void validateNoSpace(String data) throws SpaceException {
        if (data.contains(" ")) 
                throw new SpaceException();
    }
}
