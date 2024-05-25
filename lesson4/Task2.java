package lesson4;

import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {
        LinkedList<String> listCountries = new LinkedList<>();

        listCountries.addFirst("China");
        listCountries.addFirst("Russia");
        listCountries.addLast("USA");
        listCountries.addLast("UK");
        System.out.println(listCountries);

        String deletedFirstCountry = listCountries.removeFirst();
        String deletedLastCountry = listCountries.removeLast();
        System.out.println("Deleted first country: %s \nDeleted last country: %s"
                .formatted(deletedFirstCountry, deletedLastCountry));

        String firstCountry = listCountries.getFirst();
        String lastCountry = listCountries.getLast();
        System.out.println("First country: %s \nLast country: %s"
                .formatted(firstCountry, lastCountry));
    }
}
