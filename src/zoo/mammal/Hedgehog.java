//created by OrlovAG
package zoo.mammal;

public class Hedgehog extends Mammal {
    //String name;
    int weight;
    int age;

    public Hedgehog(String name, int weight, int age) {
        super(0);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Hedgehog(String name, int weight, int age, double tailLen) {
        super(tailLen);
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Фыр-фыр");
    }

    //2024-09-23 OrlovAG: учу ежа свернуться в шар
    public void top(){
        System.out.println(this+" Ежик-шарик");
    }

    @Override
    public String toString() {
        return "Hedgehog{" + name + '\'' +", вес=" + weight +", age=" + age +'}';
    }
}