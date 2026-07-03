import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            if (age < 18) {
                throw new IllegalArgumentException("You must be 18 or older!");
            }

            System.out.println("Access granted. You are eligible.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
        input.close();
    }
}