public class Dog {

    public static void DogActions() {
        Dog1 dog = new Dog1("Белая", "Берта", 2, "Кавказская овчарка");
        dog.bark();
        dog.run();
    }

    // Класс Собачка
    static class Dog1 {
        String color;
        String name;
        int age;
        String breed;

        // Конструктор
        public Dog1(String color, String name, int age, String breed) {
            this.color = color;
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        // Метод гавкания
        public void bark() {System.out.println(name + " говорит: Гав!");}
        //Метод бегания
        public void run() {System.out.println(name + " живо кружится вокруг доброго человека и приветствует, радостно виляя хвостиком");}
    }
}