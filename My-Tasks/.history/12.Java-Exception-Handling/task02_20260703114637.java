// Write a Java program to perform division of two numbers.

import java.util.Scanner; // Import the Scanner class to read input from the user

public class task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Use try-catch-finally blocks to handle exceptions that may occur during input and division
        try {
            System.out.print("Enter first number: "); // Prompt the user to enter the first integer
            int a = input.nextInt(); // Read the first integer from the user

            System.out.print("Enter second number: "); // Prompt the user to enter the second integer
            int b = input.nextInt(); // Read the second integer from the user

            int result = a / b; // Perform division and store the result in a variable
            System.out.println("Result: " + result); // Display the result of the division

        } catch (ArithmeticException e) { // Catch block to handle division by zero exception
            System.out.println("Error: Division by zero is not allowed!"); // Display an error message if the user attempts to divide by zero
        } catch (Exception e) { // Catch block to handle any other exceptions that may occur
            System.out.println("Error: Invalid input!"); // Display an error message if the user enters invalid input
        } finally { // Finally block to execute code regardless of whether an exception occurred or not
            System.out.println("Program execution completed"); // Display a message indicating that the program execution has completed
        }

        input.close(); // Close the Scanner object to free up resources
    }
}