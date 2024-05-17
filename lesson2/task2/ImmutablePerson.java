package lesson2.task2;

import java.util.Date;
import java.util.List;

public final class ImmutablePerson {

    private String name;
    private int age;
    private List<String> hobbies;
    private Date birthday;

    public ImmutablePerson() {}

    public ImmutablePerson(String name, int age, List<String> hobbies, Date birthday) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public List<String> getHobbies() {
        return this.hobbies.stream().toList();
    }

    public Date getBirthday() {
        return (Date) this.birthday.clone();
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                " name = " + this.name + 
                ", age = " + this.age + 
                ", hobbies = " + this.hobbies + 
                ", birthday = " + this.birthday + "}";
    }
}
