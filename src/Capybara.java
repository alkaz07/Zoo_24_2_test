public class Capybara {
    public static void capybara(String[] args) {
        Capybara capybara = new Capybara("Коричневая", "Лапочка", 8);
        capybara.sound();
    }

    String color;
    String name;
    int age;

    public Capybara(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public void sound() {
        System.out.println(name + " делает: стук зубами для коммуникации");
    }
}
