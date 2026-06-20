import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        int multiplier = 1;
        System.out.println("Multiplication table of " + number + ":");
        while (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            multiplier++;
        }

        scanner.close();
    }
}
