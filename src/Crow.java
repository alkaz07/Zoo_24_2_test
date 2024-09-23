public class Crow {
    private int age;
    private String name;
    private boolean genderMale;

    public Crow(int age, String name, boolean genderMale) {
        this.age = age;
        this.name = name;
        this.genderMale = genderMale;
    }

    public Crow() {
        this.age = 0;
        this.name = "Bar";
        this.genderMale = true;
    }

    public void snatch() {
        System.out.println("Mine now");
    }

    public void voice() {
        System.out.println("Caw-caw");
    }

    public void fly() {
        System.out.println("Whoosh");
    }
}
