//created by balteyes

public class Sparrow extends Animal{
    private String color;
    private float weight;
    private float length;

    public void sing (){
        System.out.println("Chirik-chirik");
    }

    public Sparrow(String name, String color, float weight, float length) {
        this.length = length;
        this.weight = weight;
        this.name = name;
        this.color = color;

    }

}
