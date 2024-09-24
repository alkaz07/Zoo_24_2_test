package zoo.mammal;

public class Dog extends Mammal {

    // Класс Собачка
    String color, /*name, */breed;
    int age, weight;

    // Конструктор
    public Dog(String color, String name, String breed, int age, int weight, double tailLength) {
        super(tailLength);
        this.color = color;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;

    }

    // Метод гавкания
    public void voice() {
        System.out.println(name + " Кто там?!");
    }

    //Метод бегания
    public void moving() {
        System.out.println(name + " живо кружится вокруг доброго человека и приветствует, радостно виляя хвостиком");
    }

}