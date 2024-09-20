public class Main {
    public static void main(String[] args) {
        Elephant hathi = new Elephant("Вася", 600, 2 );
        hathi.makeSound();

        Hippopotamus hippopotamus = new Hippopotamus();
        Dog dingo = new Dog("черный", "Петербург", 321, "");
        dingo.bark();
        Dragon dragon =new Dragon("демигоргон", 1568, "красный", true, "frost");
        dragon.drakaris();
        dragon.makeSound();
        dragon.move();
    }
}