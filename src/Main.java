public class Main {
    public static void main(String[] args) {
        Elephant hathi = new Elephant( );

        Hippopotamus hippopotamus = new Hippopotamus();
        Dragon dragon =new Dragon("демигоргон", 1568, "красный", true, "frost");
        dragon.drakaris();
        dragon.makeSound();
        dragon.move();

        Tiger tiger = new Tiger(10, "Bai", "siberian");
        tiger.voice();
        tiger.jump();
    }
}