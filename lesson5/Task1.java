package lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> listIntegers = new ArrayList<>();
        
        Stream.generate(() -> new Random().nextInt(-5, 5))
                .limit(10).forEach(listIntegers::add);
        System.out.println("Первоначальный список: %s"
                .formatted(listIntegers));

        List<Integer> listUniqueIntegers = listIntegers.stream().distinct()
                .collect(Collectors.toList());
        System.out.println("Список содержащий уникальные значения: %s"
                .formatted(listUniqueIntegers));

        List<Integer> listEvenIntegers = listUniqueIntegers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Список содержащий четные значения: %s"
                .formatted(listEvenIntegers));

        Integer amount = listEvenIntegers.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println("Сумма оставшихся элементов: %d"
                .formatted(amount));
    }
}
