// Create a program to find the bigger number using if-else.
import java.util.Scanner; // Import Scanner for reading user input

public class task07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt(); // Read the first integer from user input

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt(); // Read the second integer from user input

        // Compare the two numbers and determine which one is bigger
        if (num1 > num2) {
            System.out.println(num1 + " is the bigger number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the bigger number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Close the Scanner to free resources
        input.close();
    }
}