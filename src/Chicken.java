//created by balteyes
public class Chicken {
    private String name, color;
    private byte age, weight;

    public void sing() {
        System.out.println("Co-co-co");
    }

    public Chicken(String name, String color, byte age, byte weight)

    {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    //2024-09-23 учу птенца бегать
    public void run(){System.out.println(this +"run-run");    }


    public String toString() {
        return "Chicken{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age + ", weight=" + weight +'}';
    }
}
