// Create a program to find the smallest among three numbers
import java.util.Scanner; // Import Scanner for reading user input

public class task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input from the console

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt(); // Read the first integer from the user

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt(); // Read the second integer from the user

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt(); // Read the third integer from the user

        // Find the smallest number among num1, num2, and num3
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Display the smallest number
        System.out.println("The smallest number is: " + smallest);

        // Close the Scanner to free resources
        input.close();
    }
}