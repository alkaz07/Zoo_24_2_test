public class Dog {

    // Класс Собачка
        String color;
        String name;
        int age;
        String breed;
        int weight;

        // Конструктор
        public Dog(String color, String name, int age, String breed) {
            this.color = color;
            this.name = name;
            this.age = age;
            this.breed = breed;
            this.weight = weight;
        }

        // Метод гавкания
        public void bark() {System.out.println(name + " говорит: Тихо, я сказал! Или я тихо сказал?");}
        //Метод бегания
        public void run() {System.out.println(name + " живо кружится вокруг доброго человека и приветствует, радостно виляя хвостиком");}

}