package lesson6.Task1.validators;

import lesson6.Task1.exceptions.WhiteSpaceException;

public class WhiteSpaceValidator {

    public static void validateNoSpace(String data) throws WhiteSpaceException {
        if (data.contains(" ")) 
                throw new WhiteSpaceException();
    }
}
