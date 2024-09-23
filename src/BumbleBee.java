public class BumbleBee {

    // Класс Шмель
    String type, name;
    int age, weight;

    // Конструктор
    public BumbleBee(String type, String name, int age, int weight) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Метод жужжания
    public void voice() {
        System.out.println(name + " Дратути");
    }

    //Метод полёта
    public void moving() {
        System.out.println(name + " я тучка, тучка, тучка, я вовсе не медведь...");
    }

}
