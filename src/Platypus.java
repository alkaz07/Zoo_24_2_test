// создан класс Нарвал, by Tony

    public class Platypus {
    String name;
    int age;
    int weight;
    double length;
    String color;
    public Platypus(String name, int age, int weight, double length, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.length = length;
        this.color = color;

    }

    // научил утконоса двигаться
    public void move(){
        System.out.println(" Platypus swims around ");}

        // научил утконоса двигаться
    public void move2(){
        System.out.println(" Platypus digs mud with its beak ");
    }

        // научил утконоса издавать звуки
    public void makeSound(){
        System.out.println(" утконос:: муррчит, круу-рру-руу ");}

        public void takeSomeFood(){
            System.out.println(" утконос роет ил и кушает червячков ");}
}
