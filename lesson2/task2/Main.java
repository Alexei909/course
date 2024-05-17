package lesson2.task2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("sing");
        hobbies.add("dance");

        MutablePerson mutablePerson = new MutablePerson("John", 15, hobbies, new Date());

        System.out.println(mutablePerson);
        mutablePerson.name = "Jihn";
        mutablePerson.age = 0;

        List<String> mutablePersonHobbies = mutablePerson.hobbies;
        mutablePersonHobbies.add("sport");

        Date mutablePersonBirthday = mutablePerson.birthday;
        mutablePersonBirthday.setTime(0);

        System.out.println(mutablePerson);

        //
        ImmutablePerson immutablePerson = new ImmutablePerson("John", 15, hobbies, new Date());

        System.out.println(immutablePerson);
        String name = immutablePerson.getName();
        int age = immutablePerson.getAge();
        name = "Jihn";
        age = 0;

        /**
         * List<String> immutablePersonHobbies = immutablePerson.getHobbies();
         * immutablePersonHobbies.add("sport");
         * Теперь этот код выбрасывает java.lang.UnsupportedOperationException
         */

        Date immutablePersonBirthday = mutablePerson.birthday;
        immutablePersonBirthday.setTime(0);

        System.out.println(immutablePerson);
    }
}
