package JavaKeywords;
import java.util.Scanner;

public class SumUntilExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sum = 0;

        do {
            System.out.print("Enter a number (or 'exit' to stop): ");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("exit")) {
                sum += Integer.parseInt(input);
            }
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Total sum: " + sum);
        scanner.close();
    }
}
