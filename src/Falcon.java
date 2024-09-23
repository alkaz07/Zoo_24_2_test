public class Falcon {
    String name;
    String color;
    int weight;
    int age;

    public Falcon(String name, String color, int weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void takeOff(){
        System.out.println("Took off sharply");
    }

    public void hunting(){
        System.out.println("Tracking the target");
    }
}