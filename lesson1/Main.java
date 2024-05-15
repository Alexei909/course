package lesson1;

import lesson1.animals.Cat;
import lesson1.animals.Dog;
import lesson1.persons.Developer;
import lesson1.persons.Person;

public class Main {

    public static void main(String[] args) {
       Cat cat1 = new Cat("Cat 1");
       Cat cat2 = new Cat("Cat 2");

       Dog dog1 = new Dog("Dog 1");
       Dog dog2 = new Dog("Dog 2");

       cat1.eat();
       cat1.voice();
       cat2.eat();
       cat2.voice();

       System.out.println(cat1);
       System.out.println(cat2);

       dog1.eat("Beef");
       dog2.eat();
       dog1.voice(4);
       dog2.voice();

       System.out.println(dog1);
       System.out.println(dog2);

       Person developer1 = new Developer("John", 20, 1);
       Person developer2 = new Developer("Joy", 23, 1);
       
       developer1.eat();
       developer2.eat();

       developer1.voice("Bla bla bla");
       developer2.voice();

       System.out.println(developer1);
       System.out.println(developer2);

       developer1.work();
       developer2.work();

       developer1.stroke(cat1);
       developer1.stroke(dog2);
    }
}
