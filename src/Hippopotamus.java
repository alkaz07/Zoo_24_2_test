public class Hippopotamus {
    String name;
    String color;
    int weight;
    int age;

    public Hippopotamus(String name, String color, int weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void TopTop(){
        System.out.println("убежал плавать");
    }

    public void SwimSwim(){
        System.out.println("утонул :(");
    }

    public void Watermelon(){
        System.out.println("Уничтожает арбузы");
    }
}