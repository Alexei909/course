package lesson1.animals;

import java.util.Objects;

public abstract class AbstractAnimal {

    private String name;

    public AbstractAnimal() {}

    public AbstractAnimal(String name) { this.name = name; }

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || this.getClass() != otherObject.getClass()) return false;

        AbstractAnimal otherCat = (AbstractAnimal) otherObject;
        return Objects.equals(this.getName(), otherCat.getName());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name=" + this.getName() + "}";
    }
}
