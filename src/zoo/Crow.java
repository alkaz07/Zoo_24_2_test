package zoo;

//Created by: Tumanov
public class Crow extends Animal {
    private int age;
    private boolean genderMale;

    public Crow(int age, String name, boolean genderMale) {
        this.age = age;
        this.name = name;
        this.genderMale = genderMale;
    }

    public Crow() {
        this.age = 0;
        this.name = "Bar";
        this.genderMale = true;
    }

    public void snatch() {
        System.out.println("Mine now");
    }

    public void voice() {
        System.out.println("Caw-caw");
    }

    public void fly() {
        System.out.println("Whoosh");
    }

    public void eat() {
        System.out.println("Eat cheese");
    }

    @Override
    public String toString() {
        return "zoo.Crow{" + "age=" + age + ", name='" + name + '\'' + ", genderMale=" + genderMale + '}';
    }
}