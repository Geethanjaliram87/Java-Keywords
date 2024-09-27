package JavaKeywords;
public class SumUsingReturn {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Sum using Return: " );
        System.out.println("Sum Value is: " + add(a, b));
    }

    public static int add(int x, int y) {
        return x + y;
    }
}

