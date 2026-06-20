// Create a program to check whether a number is divisible by both 3 and 5.
import java.util.Scanner; // Import Scanner for reading user input

public class task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input from the console

        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read an integer from the user

        // Check if the number is divisible by both 3 and 5
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }

        // Close the Scanner to free resources
        input.close();
    }
}