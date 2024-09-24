package zoo.mammals;

public class Hippopotamus extends Mammal {
    //String name;
    String color;
    int weight;
    int age;

    public Hippopotamus(String name, String color, int weight, int age, double tailLen) {
        super(tailLen);
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void topTop() {
        System.out.println("Run away to swim");
    }

    public void swimSwim() {
        System.out.println("Under the water");
    }

    public void watermelon() {
        System.out.println("Destroys watermelons");
    }

    public void lunch() {
        System.out.println(this + " перекусывает фруктами");
    }

    @Override
    public String toString() {
        return "zoo.mammal.Hippopotamus (" + "Имя " + name + '\'' + ", Цвет " + color + ", Вес " + weight + ", Возраст "+ age +')';
    }
}