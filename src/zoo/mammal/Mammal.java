package zoo.mammal;

import zoo.Animal;

abstract public class Mammal extends Animal {
    protected double tailLenght;

    public Mammal(double tailLenght) {
        this.tailLenght = tailLenght;
    }

    protected Mammal() {
    }
}
