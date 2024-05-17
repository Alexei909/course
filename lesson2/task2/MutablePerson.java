package lesson2.task2;

import java.util.Date;
import java.util.List;

public class MutablePerson {

    public String name;
    public int age;
    public List<String> hobbies;
    public Date birthday;

    public MutablePerson() {}

    public MutablePerson(String name, int age, List<String> hobbies, Date birthday) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "MutablePerson{" +
                " name = " + this.name + 
                ", age = " + this.age + 
                ", hobbies = " + this.hobbies + 
                ", birthday = " + this.birthday + "}";
    }

}
