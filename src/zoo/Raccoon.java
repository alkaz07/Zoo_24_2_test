package zoo;

public class Raccoon extends Animal {
    String color; // цвет
    int weight; //вес
    int height; // высота

    public Raccoon (String color, int weight, int height) {
        this.color = color;
        this.weight = weight;
        this.height = height;



    }


    //2024-09-23 : учу енота петь
    public void top(){
        System.out.println(this+" тру-тру");
    }

    @Override
    public String toString() {
        return "zoo.Raccoon{" +"color='" + color + '\'' +", weight=" + weight +", height=" + height +'}';
    }

}
