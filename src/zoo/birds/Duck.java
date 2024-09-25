package zoo.birds;

import zoo.IDiver;
import zoo.IFlyer;
import zoo.IWalker;

public class Duck extends Bird implements IFlyer, IDiver, IWalker {
    String color;

    public Duck(String name,double wingSize, String color) {
        super(wingSize);
        this.name=name;
        this.color = color;
    }


    @Override
    public void dive() {
        System.out.println("бульк");
    }

    @Override
    public void takeoff() {
        System.out.println("Разбегается и взлетает");
    }

    @Override
    public void fly() {
        System.out.println("утка летит");
    }

    @Override
    public void land() {
        System.out.println("утка приземляется");
    }

    @Override
    public void walk() {
        System.out.println(this+" ходит по-утиному");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
