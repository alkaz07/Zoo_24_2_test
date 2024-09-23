//Нарвал(лат. Monodon monoceros), также морской единорог — млекопитающее семейства нарваловых,
// единственный вид рода нарвалы.

public class Narval {

    String name;
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
    public void move(){
        System.out.println(" unicorn moves his tooth ");}

    public void move2(){
        System.out.println(" unicorn swims upside down ");
    }

    public void makeSound(){
        System.out.println(" нарвал:: свистит, вздохает и  мычит ");}

    public void makeSound2(){
        System.out.println(" нарвал:: щелкает, скрипит и булькает");}
}
