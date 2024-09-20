class Cat {
    String color, name, breed;
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

}