package lesson6.Task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileController {

    public void writeToFile(List<String> data, String fileName) throws IOException {
        
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            data.forEach(s -> {
                try {
                    fileOutputStream.write((s + "\n").getBytes());
                } catch (IOException e) {
                    System.err.println("Ошибка записи в файл: " + e.getMessage());
                }
            });

            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } 
    }

    public void readFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int i;

            while ((i=fileInputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }

            fileInputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        editLines(stringBuilder);
    }

    public void clearFile(String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } 
    }

    private void editLines(StringBuilder stringBuilder) {
        String string = stringBuilder.toString();
        String newString = string.replace(" ", "_");
        System.out.println(newString);
    }
}
