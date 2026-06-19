import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = sn.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = sn.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        System.out.println("\nResults:");
        System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + product);

        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        sn.close();
    }
}
