package zoo.mammal;

public class Hog extends Mammal {
    public static void main(String[] args) {
        System.out.println("Creating one instance of zoo.mammal.TestHog...");
        Hog test1 = new Hog();

        test1.doSay("Hear ye, hear ye! Gather 'round and heed my words of ancient wisdom...");
        System.out.println("tail length: " + test1.tailLenght);
    }

    int x;
    int y;
    boolean hair;
    int age;
    String serialNumber;
    static int hogCount;

    Hog(int x, int y) {
        super(0);
        age = 1;
        hair = true;
        serialNumber = String.valueOf(hogCount);

        this.x = x;
        this.y = y;

        hogCount++;
    }

    Hog() {
        super(0);
        age = 1;
        hair = true;
        serialNumber = null;

        x = 0;
        y = 0;

        hogCount++;
    }

    public int doShed() {
        doSay("haha");
        if (hair) {
            hair = false;
            return 1;
        }
        return -1;
    }

    public void doSay(String voice) {
        System.out.println(voice);
    }

    public void doDig(int strength, Object target) {
        if (strength > 20) doSay("*grunt*");
        //
    }
}
