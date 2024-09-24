package zoo;

public class DogMaster {
    public static void main(String[] args){
     dogActions();
    }
    public static void dogActions() {
        Dog dog = new Dog("Белая", "Берта", "Кавказская овчарка", 2, 80, 5);
        dog.voice();
        dog.moving();
    }
}
