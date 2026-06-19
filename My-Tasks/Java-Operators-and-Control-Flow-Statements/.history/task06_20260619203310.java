import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks obtained (0-100): ");
        int marks = input.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else if (marks >= 40) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed.");
        }

        input.close();
    }
}