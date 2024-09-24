package zoo.mammal;

import zoo.mammal.Mammal;

public class Wolf extends Mammal {
    String color; // цвет
    int weight; //вес
    int height; // высота



    public Wolf (String color, int weight, int height, double tailLen) {
        super(tailLen);
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

}

