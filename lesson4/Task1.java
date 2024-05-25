package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {
        List<String> listCountries = new ArrayList<>();

        listCountries.add("Russia");
        listCountries.add("USA");
        listCountries.add("China");
        System.out.println(listCountries);

        listCountries.set(1, "UK");
        System.out.println(listCountries);

        listCountries.remove(1);
        System.out.println(listCountries);

        listCountries.remove("Russia");
        System.out.println(listCountries);

        IntStream.range(0, 5)
                .forEach(i -> listCountries.add("Country %d".formatted(i)));
        int index = listCountries.indexOf("Country 3");
        System.out.println(listCountries);
        System.out.println("Index: %d".formatted(index));

        boolean isContains = listCountries.contains("China");
        System.out.println("List has China: %s".formatted(isContains));
    }
}
