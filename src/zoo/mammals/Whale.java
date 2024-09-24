package zoo.mammals;

public class Whale extends Mammal {
    String imya;
    int ves;
    int age;

    public Whale(double tailLenght, String imya, int ves, int age) {
        super(tailLenght);
        this.imya = imya;
        this.ves = ves;
        this.age = age;
    }
}
