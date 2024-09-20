public class DogMain {
//    public static void main(String[] args) {

        Dog dog = new Dog("Белая", "Берта", 2, "Кавказская овчарка");
        dog.bark();
        dog.run();
//    }

    // Класс Собачка
    static class Dog {
        String color;
        String name;
        int age;
        String breed;

        // Конструктор
        public Dog(String color, String name, int age, String breed) {
            this.color = color;
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        // Метод гавкания
        public void bark() {System.out.println(name + " говорит: Гав!");}
        //Метод бегания
        public void run() {System.out.println(name + " бегает вокруг доброго человека и приветствует, радостно виляя хвостиком");}
    }
}