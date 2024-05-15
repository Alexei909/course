package lesson1.animals;

public class Dog extends AbstractAnimal implements Animal{

    public static final String SOUND;

    static {
        SOUND = "woof";
        System.out.println("Статический блок инициализации класса Dog");
    }

    {
        System.out.println("Нестатический блок инициализации класса Dog");
    }

    public Dog() {}

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("%s - %s eats"
                .formatted(this.getClass().getSimpleName(), this.getName()));
    }

    public void eat(String food) {
        System.out.println("%s - %s eats %s"
                .formatted(this.getClass().getSimpleName(), this.getName(), food));
    }

    @Override
    public void voice() {
        System.out.println("%s say %s"
                .formatted(this.getName(), Dog.SOUND));
    }

    public void voice(int count) {
        System.out.println("%s say %s %d times"
                .formatted(this.getName(), Dog.SOUND, count));
    }

}
