import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        int current = 1;
        int sum = 0;
        while (current <= n) {
            if (current % 2 == 0) {
                sum += current;
            }
            current++;
        }

        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}
