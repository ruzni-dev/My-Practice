// Generate Fibonacci series up to n terms.
import java.util.Scanner; // Import the Scanner class to read user input

public class task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = scanner.nextInt(); // Read the number of terms for which the Fibonacci series will be generated

        int count = 0;
        int first = 0;
        int second = 1;

        // Print the Fibonacci series up to the specified number of terms
        System.out.println("Fibonacci series up to " + terms + " terms:");
        while (count < terms) {
            System.out.print(first);
            if (count < terms - 1) {
                System.out.print(" ");
            }

            int next = first + second;
            first = second;
            second = next;
            count++;
        }

        //  Print a new line after the series is printed
        System.out.println();
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
