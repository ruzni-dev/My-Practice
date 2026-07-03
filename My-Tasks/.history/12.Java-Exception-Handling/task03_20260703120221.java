// Write a Java program that accepts a student's age.

import java.util.Scanner; // Import the Scanner class to read input from the user

public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Use try-catch block to handle exceptions that may occur during input and age validation
        try {
            System.out.print("Enter your age: "); // Prompt the user to enter their age
            int age = input.nextInt(); // Read the age from the user

            // Validate the age and throw an exception if the age is less than 18
            if (age < 18) {
                throw new IllegalArgumentException("You must be 18 or older!"); // Throw an exception with a custom message if the age is less than 18
            }

            System.out.println("Access granted. You are eligible."); // Display a message indicating that the user is eligible if the age is valid

        } catch (IllegalArgumentException e) { // Catch block to handle the IllegalArgumentException thrown for invalid age
            System.out.println("Error: " + e.getMessage()); // Display the error message from the exception if the user is under 18
        }

        System.out.println("Program continues..."); // Display a message indicating that the program continues regardless of the exception
        input.close(); // Close the Scanner object to free up resources
    }
}