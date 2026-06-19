import java.util.Scanner; // Import Scanner for reading user input

public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Largest number: " + num1);
        } else if (num2 > num1) {
            System.out.println("Largest number: " + num2);
        } else {
            System.out.println("Both numbers are equal: " + num1);
        }

        input.close();
    }
}