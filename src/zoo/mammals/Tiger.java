package zoo.mammals;

//Created by: Tumanov
public class Tiger extends Mammal {
    private int age;
    private String breed;

    public Tiger(int age, String name, String breed) {
        super(1);
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public Tiger() {
        super(1);
        this.age = 0;
        this.name = "unnamed";
        this.breed = "whoknows";
    }
    public void voice() {
        System.out.println("R-r-r-r-r-r");
    }

    public void jump() {
        System.out.println("Whoosh...Thud");
    }

    public void eat() {
        System.out.println("Tear out a huge piece of meat");
    }

    @Override
    public String toString() {
        return "zoo.Tiger{" + "age=" + age + ", name='" + name + '\'' + ", breed='" + breed + '\'' + '}';
    }
}
