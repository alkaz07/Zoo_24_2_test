//Created by: Tumanov
public class Cow {
    private int age, weight;
    private String name, color;

    public Cow(int age, int weight, String name, String color) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public Cow() {
        this.age = 0;
        this.weight = 50;
        this.name = "Mooy";
        this.color = "brown";
    }

    public void voice() {
        System.out.println("Moo");
    }

    public void run() {
        System.out.println("Thud-thud-thud");
    }

     public void eat() {
         System.out.println("Munch a bunch of grass");
     }

    @Override
    public String toString() {
        return "Cow{" + "age=" + age + ", weight=" + weight + ", name='" + name + '\'' + ", color='" + color + '\'' + '}';
    }
}
