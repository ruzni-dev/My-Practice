import java.util.Scanner; // Import Scanner for reading user input

public class task01 {
    public static void main(String[] args) {
        // Create Scanner object to read input from the console
        Scanner sn = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = sn.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = sn.nextInt();

        // Perform the four arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display the results for addition, subtraction, and multiplication
        System.out.println("\nResults:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

        // Handle division separately and avoid division by zero
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        // Close the Scanner to free resources
        sn.close();
    }
}
