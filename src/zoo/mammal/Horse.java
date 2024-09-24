//created by OrlovAG
package zoo.mammal;

public class Horse extends Mammal {
    //String name;
    int weight;
    int age;

    public Horse(String name, int weight, int age) {
        super(0);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Horse(String name, int weight, int age, double tailLen) {
        super(tailLen);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Игого");
    }

    //2024-09-23 OrlovAG: учу Horse стучать копытами
    public void top(){
        System.out.println(this+" цок-цок");
    }

    @Override
    public String toString() {
        return "Horse{" + name + '\'' +", вес=" + weight +", age=" + age +'}';
    }
}