package zoo.mammals;

import zoo.Animal;

abstract public class Mammal extends Animal {
    protected double tailLength;

    public Mammal(double tailLength) {
        this.tailLength = tailLength;
    }
/*
    protected Mammal() {
        tailLength=0;
    }*/
}
