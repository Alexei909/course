package lesson7.utils;

import java.util.Random;

public class Randomaizer {

    private static final Random random = new Random();

    public static int getRandomValue(int min, int max) {
        return random.nextInt(min, max+1);
    }
}
