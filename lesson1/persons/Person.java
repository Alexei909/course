package lesson1.persons;

import lesson1.animals.AbstractAnimal;
import lesson1.creatures.Creature;

public interface Person extends Creature {
    void voice(String phrase);
    void work();
    void stroke(AbstractAnimal animal);
}
