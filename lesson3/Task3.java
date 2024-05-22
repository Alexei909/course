package lesson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Введите строки, для завершения ввода введите \"quit\"");

        while (scanner.hasNextLine()) {
            String currString = scanner.nextLine();
            
            if (currString.equals("quit")) {
                scanner.close();
                break;
            }

            strings.add(currString);
        }

        String result = "";

        for (String str : strings) {
            Set<Character> chars = new HashSet<>();

            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (chars.contains(str.charAt(i))) {
                    flag = false;
                    break;
                };

                chars.add(str.charAt(i));
            }

            if (flag) {
                result = str;
                break;
            }
        }

        System.out.println("Result - \"%s\"".formatted(result));
    }
}
