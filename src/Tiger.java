//Created by: Tumanov
public class Tiger {
    private int age;
    private String name, breed;

    public void voice() {
        System.out.println("R-r-r-r-r-r");
    }

    public void jump() {
        System.out.println("Whoosh...Thud");
    }

    public Tiger(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public Tiger() {
        this.age = 0;
        this.name = "unnamed";
        this.breed = "whoknows";
    }

    @Override
    public String toString() {
        return "Tiger{" + "age=" + age + ", name='" + name + '\'' + ", breed='" + breed + '\'' + '}';
    }
}
