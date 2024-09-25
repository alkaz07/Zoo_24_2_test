package zoo.birds;

import zoo.IFlyer;

//Created by: Tumanov
public class Crow extends Bird implements IFlyer {
    private int age;
    private boolean genderMale;

    public Crow(int age, String name, boolean genderMale) {
        super(0.5);
        this.age = age;
        this.name = name;
        this.genderMale = genderMale;
    }

    public Crow() {
        super(0.5);
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

    @Override
    public void takeoff() {
        System.out.println("ворона взлетает с места");
    }

    public void fly() {
        System.out.println("Whoosh");
    }

    @Override
    public void land() {
        System.out.println("ворона изящно садится");
    }

    public void eat() {
        System.out.println("Eat cheese");
    }

    @Override
    public String toString() {
        return "zoo.Crow{" + "age=" + age + ", name='" + name + '\'' + ", genderMale=" + genderMale + '}';
    }
}
