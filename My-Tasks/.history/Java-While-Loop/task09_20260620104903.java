import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = scanner.nextInt();

        int count = 0;
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series up to " + terms + " terms:");
        while (count < terms) {
            System.out.print(first);
            if (count < terms - 1) {
                System.out.print(" ");
            }

            int next = first + second;
            first = second;
            second = next;
            count++;
        }

        System.out.println();
        scanner.close();
    }
}
