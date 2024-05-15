package lesson1.persons;

import java.util.Objects;

public abstract class AbstractPerson {
    public static final String basicSpeech;
    private String name;
    private int age;

    static {
        basicSpeech = "Hi I'm human";
        System.out.println("Статический блок инициализации класса Person");
    }

    public AbstractPerson() {}

    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public String getName() { return this.name; }

    public int getAge() { return this.age; }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || this.getClass() != otherObject.getClass()) return false;

        AbstractPerson otherPerson = (AbstractPerson) otherObject;
        return Objects.equals(this.getName(), otherPerson.getName()) &&
                this.getAge() == otherPerson.getAge();
    }

    public boolean equals(AbstractPerson person, Object otherObject) {
        if (person == otherObject) return true;
        if (otherObject == null || person.getClass() != otherObject.getClass()) return false;

        AbstractPerson otherPerson = (AbstractPerson) otherObject;
        return Objects.equals(person.getName(), otherPerson.getName()) &&
                person.getAge() == otherPerson.getAge();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name=" + this.getName() + 
                ", age=" + this.age + "}";
    }
}
