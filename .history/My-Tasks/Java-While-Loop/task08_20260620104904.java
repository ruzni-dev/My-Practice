import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check for palindrome: ");
        long inputNumber = scanner.nextLong();

        long number = Math.abs(inputNumber);
        long reversedNumber = 0;
        long originalNumber = number;

        while (number > 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (reversedNumber == originalNumber) {
            System.out.println(inputNumber + " is a palindrome number.");
        } else {
            System.out.println(inputNumber + " is not a palindrome number.");
        }

        scanner.close();
    }
}
