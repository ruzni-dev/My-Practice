// Find the sum of all even numbers from 1 to n.
import java.util.Scanner; // Import Scanner for reading user input

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to read input from the console

        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt(); // Read a positive integer from the user

        // Initialize variables to keep track of the current number and the sum of even numbers
        int current = 1;
        int sum = 0;
        while (current <= n) {
            // Check if the current number is even
            if (current % 2 == 0) {
                sum += current;
            }
            current++;
        }

        // Display the sum of even numbers from 1 to n
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
        scanner.close(); // Close the Scanner to free resources
    }
}
