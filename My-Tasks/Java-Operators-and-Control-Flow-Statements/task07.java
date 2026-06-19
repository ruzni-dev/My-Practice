import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the bigger number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the bigger number.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}