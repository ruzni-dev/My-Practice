// Print the multiplication table of a given number using a while loop.
import java.util.Scanner; // Import the Scanner class to read user input

public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt(); // Read the number for which the multiplication table will be printed

        System.out.println("Multiplication table of " + number + ":");

        // Use a while loop to print the multiplication table from 1 to 10
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            multiplier++;
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
