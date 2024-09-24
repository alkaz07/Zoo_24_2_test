package zoo.fishes;

public class GoldenFish extends Fish {

    // Класс Золотая рыбка
    String type/*, name*/;
    int age, weight;

    // Конструктор
    public GoldenFish(String type, String name, int age, int weight, String typeOfWater) {
        super(typeOfWater);
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Метод звучания
    public void voice() {
        System.out.println(name + " загадай желание");
    }

    //Метод движения
    public void moving() {
        System.out.println(name + " пусть твоё доброе желание сбудется");
    }

}
