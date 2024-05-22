package lesson3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String minString = firstString;
        String maxString = firstString;

        System.out.println("Введите строки, для завершения ввода введите \"quit\"");

        while (scanner.hasNextLine()) {
            String currString = scanner.nextLine();

            if (currString.equals("quit")) {
                scanner.close();
                break;
            }

            if (currString.length() < minString.length()) {
                minString = currString;
            } else if (currString.length() > maxString.length()) {
                maxString = currString;
            } 
        }

        System.out.println("Min string: %s, length: %d \nMax string: %s, length: %d"
                .formatted(minString, minString.length(), maxString, maxString.length()));
    }
}
