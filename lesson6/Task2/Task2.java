package lesson6.Task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы закончить ввод данных введите \"quit\".");

        List<String> lines = readFromConsole(scanner);
        System.out.println();

        FileController fileController = new FileController();
        fileController.writeToFile(lines, "./tms.txt");
        fileController.readFromFile("./tms.txt");
        fileController.clearFile("./tms.txt");
    }

    private static List<String> readFromConsole(Scanner scanner) {
        List<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String currString = scanner.nextLine();

            if (currString.equals("quit")) {
                scanner.close();
                break;
            }

            lines.add(currString);
        }

        return lines;
    }
}
