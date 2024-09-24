

//created by OrlovAG
package zoo.birds;

public class Owl extends Bird {
    //String name;
    int weight;
    int age;

    public Owl(String name, int weight, int age) {
        super(70);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Owl(String name, int weight, int age, double wingSize) {
        super(wingSize);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Угу");
    }

    //2024-09-23 OrlovAG: учу сову хлопать крыльями
    public void top(){
        System.out.println(this+" Хлоп ");
    }

    @Override
    public String toString() {
        return "Owl{" + name + '\'' +", вес=" + weight +", age=" + age +'}';
    }
}