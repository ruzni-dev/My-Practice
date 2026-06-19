// Create a program to check whether a number is positive, negative, or zero.
import java.util.Scanner; // Import Scanner for reading user input

public class task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number from user input
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner to free resources
        input.close();
    }
}