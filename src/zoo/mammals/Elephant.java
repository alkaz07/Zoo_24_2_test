//created by alkaz07
package zoo.mammals;

public class Elephant extends Mammal {
    //String name;
    int weight;
    int age;

    public Elephant(String name, int weight, int age) {
        super(0);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Elephant(String name, int weight, int age, double tailLen) {
        super(tailLen);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Труууууу");
    }

    //2024-09-23 alkaz07: учу слона топать
    public void top(){
        System.out.println(this+" топ-топ");
    }

    @Override
    public String toString() {
        return "Elephant{" + name + '\'' +", вес=" + weight +", age=" + age +'}';
    }
}
