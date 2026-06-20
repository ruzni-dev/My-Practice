// Create a menu-driven calculator using a while loop that continues until the user chooses to exit.
import java.util.Scanner; // Import the Scanner class to read user input

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Initialize the choice variable to control the menu loop
        int choice = 0;
        while (choice != 5) {
            // Display the calculator menu to the user
            System.out.println("Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();

            // If the user chooses to exit, break the loop
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            // Prompt the user to enter two numbers for the selected operation
            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();
            
            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;
                case 2:
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;
                case 4:
                    if (secondNumber != 0) {
                        System.out.println("Result: " + (firstNumber / secondNumber));
                    } else {
                        System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            System.out.println();
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
