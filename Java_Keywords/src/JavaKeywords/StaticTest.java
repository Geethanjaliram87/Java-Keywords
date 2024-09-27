package JavaKeywords;
class StaticExample {
    static int count = 0;

    StaticExample() {
        count++;
    }

    static void showCount() {
        System.out.println("Total instances: " + count);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        System.out.println("Print Total Instance using Static Keywords");
        StaticExample.showCount(); // Can be called without creating an object
    }
}
