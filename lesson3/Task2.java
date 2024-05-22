package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Введите строки, для завершения ввода введите \"quit\"");

        String firstString = scanner.nextLine();
        strings.add(firstString);
        int maxLength = firstString.length();
        int minLength = firstString.length();

        while (scanner.hasNextLine()) {
            String currString = scanner.nextLine();
            int currLength = currString.length();

            if (currString.equals("quit")) {
                scanner.close();
                break;
            }

            if (currLength < minLength) {
                minLength = currLength;
            } else if (currLength > maxLength) {
                maxLength = currLength;
            }

            strings.add(currString);
        }

        Collections.sort(strings);
        int avgLength = (int) Math.ceil((double) (minLength + maxLength) / 2.0);

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() >= avgLength) break;

            System.out.println("String - \"%s\", length: %d"
                    .formatted(strings.get(i), strings.get(i).length()));
        }
    }
}
