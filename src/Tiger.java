public class Tiger {
    int age;
    String name, breed;

    public void voice() {
        System.out.println("R-r-r-r-r-r");
    }

    public void jump() {
        System.out.println("Whoosh...Thud");
    }

    public Tiger(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
}
