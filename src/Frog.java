public class Frog {
    String name;
    String color;
    int weight;
    int age;

    public Frog(String name, String color, int weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void jumping(){
        System.out.println("Jumping on water lilies");
    }

    public void lunch(){
        System.out.println("Eats flies");
    }

    public void swim(){
        System.out.println("Swims underwater");
    }
}