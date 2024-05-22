package lesson3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите строку");

        String str = scanner.nextLine();
        scanner.close();

        StringBuilder builder = new StringBuilder();

        for (String character : str.split("")) {
            builder.append(character.repeat(2));
        }

        System.out.println(builder);
    }
}
