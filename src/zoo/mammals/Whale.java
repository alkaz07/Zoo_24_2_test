package zoo.mammals;

import zoo.IDiver;

public class Whale extends Mammal implements IDiver {
    String imya;
    int ves;
    int age;

    public Whale(double tailLenght, String imya, int ves, int age) {
        super(tailLenght);
        this.imya = imya;
        this.ves = ves;
        this.age = age;
    }

    @Override
    public void dive() {
        System.out.println("Кит задерживает дыхание и глубоко ныряет");
    }
}
