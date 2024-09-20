// Класс Собачка
static class Dog {
    String color;
    String name;
    int age;
    String breed;

    // Конструктор
    public Dog(String color, String name, int age, String breed) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Метод гавкания
    public void bark() {
        System.out.println(name + " говорит: Гав!");
    }
}