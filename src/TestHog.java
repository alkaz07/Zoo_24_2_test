public class TestHog {
    public static void main(String[] args) {
        System.out.println("Creating one instance of TestHog...");
        TestHog test1 = new TestHog();

        test1.doSay("Hear ye, hear ye! Gather 'round and heed my words of ancient wisdom...");
    }

    int x;
    int y;
    boolean hair;
    int age;
    String serialNumber;
    static int hogCount;

    TestHog(int x, int y) {
        age = 1;
        hair = true;
        serialNumber = String.valueOf(hogCount);

        this.x = x;
        this.y = y;

        hogCount++;
    }

    TestHog() {
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
        if (strength>20) doSay("*grunt*");
        //
    }
}
