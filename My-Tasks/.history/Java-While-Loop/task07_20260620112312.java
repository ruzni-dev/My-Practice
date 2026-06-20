// Find the factorial of a number.
import java.util.Scanner; // Import the Scanner class to read user input

public class task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = scanner.nextInt(); // Read the number for which the factorial will be calculated

        // Validate that the input number is non-negative
        long factorial = 1;
        int current = 1;
        while (current <= number) {
            factorial *= current;
            current++;
        }

        // Print the factorial of the input number
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
