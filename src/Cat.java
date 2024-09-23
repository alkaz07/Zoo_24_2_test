//created by balteyes
class Cat extends Animal {
    String color, breed;
    byte age, weight;

    public Cat(String color, String name, String breed, byte age, byte weight) {
        this.color = color;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public void sleep (){
        System.out.println("sleep");
    }

    public String ability() {
        return "Мяу";

    }

    public void askFood (){
        System.out.println("Feed me!");
    }

    //2024-09-23 учу кота мурлыкать
    public void frr() { System.out.println(this+" frrrr-frrrr");
    }


    @Override
    public String toString() { return "Cat{" + "color='" + color + '\'' + ", name='" + name + '\'' + ", breed='" + breed + '\'' +
                ", age=" + age + ", weight=" + weight +  '}';
    }
}
