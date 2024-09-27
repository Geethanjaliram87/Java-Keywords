package JavaKeywords;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            methodThatThrows();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    static void methodThatThrows() throws IOException {
        throw new IOException("Custom IOException");
    }
}

