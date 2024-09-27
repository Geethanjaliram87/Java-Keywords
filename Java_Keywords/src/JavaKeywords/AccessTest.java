package JavaKeywords;
class AccessModifiers {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;

    public void showPublic() {
        System.out.println("Public method");
    }

    private void showPrivate() {
        System.out.println("Private method");
    }

    protected void showProtected() {
        System.out.println("Protected method");
    }

    public void accessPrivateMethod() {
        // Calling private method within the same class
        showPrivate();
    }
}

public class AccessTest {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("Public variable: " + obj.publicVar);
        System.out.println("Protected variable: " + obj.protectedVar);

        obj.showPublic();
        obj.showProtected();
        
        // Uncommenting below line will cause error, private method is inaccessible from here
        // obj.showPrivate();

        // Calling public method that internally accesses private method
        obj.accessPrivateMethod();
    }
}

