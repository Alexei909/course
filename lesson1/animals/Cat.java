package lesson1.animals;

public class Cat extends AbstractAnimal implements Animal {

    public static final String SOUND;

    static {
        SOUND = "meow";
        System.out.println("Статический блок инициализации класса Cat");
    }

    {
        System.out.println("Нестатический блок инициализации класса Cat");
    }
 
    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("%s - %s eats"
                .formatted(this.getClass().getSimpleName(), this.getName()));
    }

    @Override
    public void voice() {
        System.out.println("%s say %s".formatted(this.getName(), Cat.SOUND));
    }

}
