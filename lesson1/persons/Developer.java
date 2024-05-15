package lesson1.persons;

import lesson1.animals.AbstractAnimal;

public class Developer extends AbstractPerson implements Person {

    private int workExperience;

    public Developer(String name, int age, int workExperience) {
        super(name, age);
        this.workExperience = workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getWorkExperience() { return this.workExperience; }

    @Override
    public void eat() {
        System.out.println("%s - %s eats"
                .formatted(this.getClass().getSimpleName(), this.getName()));
    }

    @Override
    public void voice() {
        System.out.println("%s said - %s"
                .formatted(this.getName(), AbstractPerson.basicSpeech));
    }

    public void voice(String phrase) {
        System.out.println("%s %s said - %s"
                .formatted(this.getClass().getSimpleName(), this.getName(), phrase));
    }

    @Override
    public void work() {
        System.out.println("%s %s work..."
                .formatted(this.getClass().getSimpleName(), this.getName()));
    }

    @Override
    public void stroke(AbstractAnimal animal) {
        System.out.println("%s stroke - %s %s"
                .formatted(this.getName(), animal.getClass().getSimpleName(), animal.getName()));
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(this, otherObject)) return false;

        Developer otherPerson = (Developer) otherObject;
        return this.getWorkExperience() == otherPerson.getWorkExperience();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name=" + this.getName() + 
                ", age=" + this.getAge() + 
                ", work_experience=" + this.getWorkExperience() 
                + " years" + "}";
    }
}
