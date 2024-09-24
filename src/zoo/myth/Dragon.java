package zoo.myth;

import zoo.Animal;

// создан класс Дракон, by Tony
public class Dragon extends Animal {

        String majesticName;
        int age;
        String color;
        boolean transform;
        String element;


    public Dragon(String majesticName, int age, String color, boolean transform, String element) {
            this.majesticName = majesticName;
            this.age = age;
            this.color = color;
            this.transform = transform;
            this.element = element;
        }

        // по команде ДРАКАРИС дракон дышит огнем
        public void drakaris(){
            System.out.println(" make Fire ");
        }

        // я не учил дракона летать - он умел это сам
        public void move(){
        System.out.println(" zoo.myth.Dragon fly to the sky ");}

    // научил дракона издавать звук
        public void makeSound(){
        System.out.println(" оглушительный рык");}

    public void takeSomeFood(){
        System.out.println(" дракон пикирует с небес и хватает бедную овечку ");}

    @Override
    public String toString() {
        return "zoo.myth.Dragon{" +
                "majesticName='" + majesticName + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", transform=" + transform +
                ", element='" + element + '\'' +
                '}';
    }

}
