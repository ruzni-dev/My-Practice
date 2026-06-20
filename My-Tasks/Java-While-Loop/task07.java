import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = scanner.nextInt();

        long factorial = 1;
        int current = 1;
        while (current <= number) {
            factorial *= current;
            current++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
