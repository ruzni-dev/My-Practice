import java.util.Scanner; // Import Scanner for reading user input

public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input               

        System.out.print("Enter first number: ");
        int num1 = input.nextInt(); // Read the first integer from user input

        System.out.print("Enter second number: ");
        int num2 = input.nextInt(); // Read the second integer from user input

        // Compare the two numbers and determine which one is larger
        if (num1 > num2) {
            System.out.println("Largest number: " + num1);
        } else if (num2 > num1) {
            System.out.println("Largest number: " + num2);
        } else {
            System.out.println("Both numbers are equal: " + num1);
        }

        // Close the Scanner to free resources
        input.close();
    }
}