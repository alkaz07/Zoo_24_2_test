package zoo.birds;

import zoo.Animal;

abstract public class Bird extends Animal {
    protected double wingSize;

    public Bird(double wingSize) {
        this.wingSize = wingSize;
    }

    public void flap(){
        System.out.println(this+" машет крыльями размахом "+wingSize);
    }
}
