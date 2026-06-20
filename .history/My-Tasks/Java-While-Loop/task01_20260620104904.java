import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to start printing numbers from 1 to 100: ");
        scanner.nextLine();

        int number = 1;
        System.out.println("Numbers from 1 to 100:");
        while (number <= 100) {
            System.out.println(number);
            number++;
        }

        scanner.close();
    }
}
