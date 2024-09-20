public class Fox {
    String name,color;
    int age;
    int amountchildren;
    public  void makeSound(){
        System.out.println( "Tyav,tyav");
        }
    public static void main(String[] args) {
     Fox cunning = new Fox("Белая","Alisa",5,0);
    }

  public Fox(String color,String name,int age,int amountchildren){
        this.color = color;
        this.name = name;
        this.age = age;
        this.amountchildren = amountchildren;

  }
}
