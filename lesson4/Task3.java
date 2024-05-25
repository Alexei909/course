package lesson4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {
        Set<Person> listPersons = new HashSet<>();

        Person person1 = new Person("Person 1");
        Person person2 = new Person("Person 2");
        Person person3 = new Person("Person 3");

        listPersons.addAll(List.of(person1, person2, person3));
        
        listPersons.forEach(p -> System.out.println(p));

        listPersons.removeIf(p -> !p.getName().equals("Person 1"));
        System.out.println(listPersons);

        boolean isContains = listPersons.contains(person1);
        System.out.println("Set has Person1: %s".formatted(isContains));
    }
}
