import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        long inputNumber = scanner.nextLong();

        long number = Math.abs(inputNumber);
        int digitCount = 0;

        if (number == 0) {
            digitCount = 1;
        }

        while (number > 0) {
            digitCount++;
            number /= 10;
        }

        System.out.println("Number of digits in " + inputNumber + " is: " + digitCount);
        scanner.close();
    }
}
