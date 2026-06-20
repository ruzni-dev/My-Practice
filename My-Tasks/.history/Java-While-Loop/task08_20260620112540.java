// Check whether a number is palindrome or not.
import java.util.Scanner; // Import the Scanner class to read user input

public class task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter a number to check for palindrome: ");
        long inputNumber = scanner.nextLong(); // Read the number to be checked for palindrome

        // Handle negative numbers by working with their absolute value
        long number = Math.abs(inputNumber);
        long reversedNumber = 0;
        long originalNumber = number;

        // Use a while loop to reverse the digits of the number
        while (number > 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number and the reversed number are the same
        if (reversedNumber == originalNumber) {
            System.out.println(inputNumber + " is a palindrome number.");
        } else {
            System.out.println(inputNumber + " is not a palindrome number.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
