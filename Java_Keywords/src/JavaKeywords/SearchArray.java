package JavaKeywords;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array and get the elements from the user
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the target value from the user
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();
        
        boolean found = false;

        // Search the target value in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        // If target not found, print not found
        if (!found) {
            System.out.println("Not found");
        }

        scanner.close();
    }
}

