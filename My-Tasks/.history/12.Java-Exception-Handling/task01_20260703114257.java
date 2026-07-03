// Write a Java program that accepts two integers from the user and performs division.

import java.util.InputMismatchException; // Import the InputMismatchException class to handle invalid input types
import java.util.Scanner; // Import the Scanner class to read input from the user

public class task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Use try-catch blocks to handle exceptions that may occur during input and division
        try {
            System.out.print("Enter first number: "); // Prompt the user to enter the first integer
            int num1 = input.nextInt(); // Read the first integer from the user

            System.out.print("Enter second number: "); // Prompt the user to enter the second integer
            int num2 = input.nextInt(); // Read the second integer from the user

            int result = num1 / num2; // Perform division and store the result in a variable
            System.out.println("Result: " + result); // Display the result of the division

        } catch (ArithmeticException e) { // Catch block to handle division by zero exception
            System.out.println("Error: Cannot divide by zero!"); // Display an error message if the user attempts to divide by zero
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only!"); // Display an error message if the user enters invalid input
        }

        System.out.println("Program ended."); // Display a message indicating that the program has ended
        input.close(); // Close the Scanner object to free up resources
    }
}
