import java.util.Scanner; // Import Scanner for reading user input

public class task01 {
    public static void main(String[] args) {
        // Create Scanner object to read input from the console
        Scanner sn = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double firstNumber = sn.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double secondNumber = sn.nextDouble();

        // Perform the four arithmetic operations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display the results for addition, subtraction, and multiplication
        System.out.println("\nResults:");
        System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + product);

        // Handle division separately and avoid division by zero
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        // Close the Scanner to free resources
        sn.close();
    }
}
