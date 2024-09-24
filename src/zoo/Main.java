package zoo;

import zoo.mammal.Bear;
import zoo.mammal.Dog;
import zoo.mammal.Elephant;
import zoo.mammal.Fox;
import zoo.myth.Dragon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        example1();
    }

    public static void example1() {
        Elephant[] elephants = new Elephant[3];
        System.out.println(Arrays.toString(elephants)); //[null, null, null]
        elephants[0] = new Elephant("Петя", 3000, 30);
        elephants[1] = new Elephant("Глаша", 5000, 22);
        elephants[2] = new Elephant("Брама", 4500, 33);
        System.out.println(Arrays.toString(elephants)); //[Elephant{name='Петя', weight=3000, age=30}, Elephant{name='Глаша', weight=5000, age=22}, Elephant{name='Брама', weight=4500, age=33}]

        Fox[] foxes = new Fox[2];
        foxes[0] = new Fox("рыжая", "Женя", 6, 0);
        foxes[1] = new Fox("бурый", "Гриша", 7, 5);
        System.out.println(Arrays.toString(foxes));

        Object[] objects = new Object[elephants.length + foxes.length];
        objects[0] = elephants[0];
        objects[1] = elephants[1];
        objects[2] = elephants[2];
        objects[3] = foxes[1];
        objects[4] = foxes[0];
        System.out.println(Arrays.toString(objects));


        for (Object el : objects) {
            if (el instanceof Elephant) {
                ((Elephant) el).top();
            }
            else System.out.println("это не слон");
        }

        Animal[] animals = new Animal[objects.length];
        for (int i=0; i< animals.length; i++)
            animals[i] = (Animal)objects[i];

        System.out.println("имена животных:");
        for (Animal a: animals)
            System.out.println(a.name);
    }


    private static void example0() {
        Elephant hathi = new Elephant("Вася", 600, 2);
        hathi.makeSound();
        hathi.top();

        // zoo.Hippopotamus hippopotamus = new zoo.Hippopotamus();
        Dog dingo = new Dog("черный", "Петербург", "", 321, 80, 10);
        dingo.voice();
        Dragon dragon = new Dragon("демигоргон", 1568, "красный", true, "frost");
        dragon.drakaris();
        dragon.makeSound();
        dragon.move();
        Bear medved = new Bear("Цвет", 99, 33);

        Narval narval = new Narval("Вилли", 39, 800, 2, "сине-серый");
        narval.makeSound();
        narval.makeSound2();
        narval.move();
        narval.move2();

        Platypus platypus = new Platypus("Агент Пи", 2, 1, 30, "brown");
        platypus.move();
        platypus.move2();
        platypus.makeSound();
    }
}