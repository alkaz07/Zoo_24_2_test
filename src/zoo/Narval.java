package zoo;// создан класс Нарвал, by Tony
//Нарвал(лат. Monodon monoceros), также морской единорог — млекопитающее семейства нарваловых,
// единственный вид рода нарвалы.

public class Narval extends Animal{

    //String name;
    int age;
    int weight;
    int toothLength;
    String color;



    public Narval(String name, int age, int weight, int toothLength, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.toothLength = toothLength;
        this.color = color;

    }

    // научил нарвала двигаться
    public void move(){
        System.out.println(" unicorn moves his tooth ");}

    // научил нарвала двигаться2
    public void move2(){
        System.out.println(" unicorn swims upside down ");
    }

    // научил утконоса издавать звуки
    public void makeSound(){
        System.out.println(" нарвал:: свистит, вздохает и  мычит ");}

    // научил утконоса издавать звуки
    public void makeSound2(){
        System.out.println(" нарвал:: щелкает, скрипит и булькает");}

    public void takeSomeFood(){
        System.out.println(" нарвал добывает рыбку ");}

    @Override
    public String toString() {
        return "zoo.Narval{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", toothLength=" + toothLength +
                ", color='" + color + '\'' +
                '}';
    }
}
