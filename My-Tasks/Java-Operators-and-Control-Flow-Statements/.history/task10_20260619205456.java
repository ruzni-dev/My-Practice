// Create a simple calculator using switch statement.
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble(); // Read the first number from user input

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble(); // Read the second number from user input

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0); // Read the operator from user input

        // Use a switch statement to perform the calculation based on the operator
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                break;
        }

        // Close the Scanner to free resources
        input.close();
    }
}