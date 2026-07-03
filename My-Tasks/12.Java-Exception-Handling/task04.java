// Write a Java program to check whether a number is positive.

import java.util.Scanner; // Import the Scanner class to read input from the user

public class task04 {

    // Method with throws
    public static void checkNumber(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Negative number not allowed!"); // Throw an exception with a custom message if the number is negative
        } else {
            System.out.println("Valid number: " + number); // Display a message indicating that the number is valid if it is positive
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Use try-catch block to handle exceptions that may occur during input and number validation
        try {
            System.out.print("Enter a number: "); // Prompt the user to enter a number
            int num = input.nextInt(); // Read the number from the user

            checkNumber(num); // Call the checkNumber method to validate the number and handle any exceptions thrown

        } catch (Exception e) { // Catch block to handle the Exception thrown for invalid number
            System.out.println("Error: " + e.getMessage()); // Display the error message from the exception if the number is negative
        }

        System.out.println("Program finished safely."); // Display a message indicating that the program has finished safely regardless of the exception
        input.close(); // Close the Scanner object to free up resources
    }
}