import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        long inputNumber = scanner.nextLong();

        long number = Math.abs(inputNumber);
        long reversedNumber = 0;
        while (number > 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (inputNumber < 0) {
            reversedNumber = -reversedNumber;
        }

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
