// Count the digits in a number.
import java.util.Scanner; // Import the Scanner class to read user input

public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        
        System.out.print("Enter a number to count its digits: ");
        long inputNumber = scanner.nextLong(); // Read the number for which the digit count will be calculated

        // Handle negative numbers by working with their absolute value
        long number = Math.abs(inputNumber);
        int digitCount = 0;

        // If the number is 0, it has 1 digit
        if (number == 0) {
            digitCount = 1;
        }

        // Use a while loop to count the digits in the number
        while (number > 0) {
            digitCount++;
            number /= 10;
        }

        // Print the number of digits in the input number
        System.out.println("Number of digits in " + inputNumber + " is: " + digitCount);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
