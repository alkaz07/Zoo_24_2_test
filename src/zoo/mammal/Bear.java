package zoo.mammal;

public class Bear extends Mammal {
    String color; // цвет
    int weight; //вес
    int height; // высота

    public Bear (String color, int weight, int height) {
        super(0);
        this.color = color;
        this.weight = weight;
        this.height = height;
    }
    public Bear (String color,int weight, int height, double tailLen){
        super(tailLen);
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

}