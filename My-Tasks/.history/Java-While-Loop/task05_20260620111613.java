// Reverse a given number.
import java.util.Scanner; // Import the Scanner class to read user input

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter a number to reverse: ");
        long inputNumber = scanner.nextLong(); // Read the number to be reversed

        // Handle negative numbers by working with their absolute value
        long number = Math.abs(inputNumber);
        long reversedNumber = 0;
        // Use a while loop to reverse the digits of the number
        while (number > 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // If the original number was negative, make the reversed number negative as well
        if (inputNumber < 0) {
            reversedNumber = -reversedNumber;
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();// Close the scanner to prevent resource leaks
    }
}
