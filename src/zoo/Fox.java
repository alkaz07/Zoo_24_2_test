package zoo;

import zoo.mammal.Mammal;

public class Fox  extends Mammal {
    String color;
    int age;
    int amountchildren;
    public  void makeSound(){
        System.out.println( "Tyav,tyav");
        }
    public static void main(String[] args) {
     Fox cunning = new Fox("Белая","Alisa",5,0);
     cunning.makeSound();

    }

  public Fox(String color,String name,int age,int amountchildren){
      super(50);
      this.color = color;
        this.name = name;
        this.age = age;
        this.amountchildren = amountchildren;
    }
    //учу лису прыгать
    public void spring(){System.out.println(this+" Прыг скок");}
    @Override
    public String toString() {return "zoo.Fox{" + "name='" + name + '\'' + ", color='" + color + '\'' +
                ", age=" + age +
                ", amountchildren=" + amountchildren +
                '}';
    }
}
