// Create a grade calculator using else-if conditions.
import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter the marks obtained (0-100): ");
        int marks = input.nextInt(); // Read the marks from user input

        // Check if the marks are valid and determine the grade
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Close the Scanner to free resources
        input.close();
    }
}