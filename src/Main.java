public class Main {
    public static void main(String[] args) {
        Elephant hathi = new Elephant("Вася", 600, 2 );
        hathi.makeSound();

       // Hippopotamus hippopotamus = new Hippopotamus();
        Dog dingo = new Dog("черный", "Петербург", "", 321, 80);
        dingo.voice();
        Dragon dragon =new Dragon("демигоргон", 1568, "красный", true, "frost");
        dragon.drakaris();
        dragon.makeSound();
        dragon.move();
        Bear medved   = new Bear ("Цвет", 99, 33);

        Narval narval = new Narval("Вилли", 39, 800,  2, "сине-серый");
        narval.makeSound(); narval.makeSound2(); narval.move(); narval.move2();

        Platypus platypus = new Platypus("Агент Пи", 2, 1,30, "brown");
        platypus.move(); platypus.move2(); platypus.makeSound();
    }
}