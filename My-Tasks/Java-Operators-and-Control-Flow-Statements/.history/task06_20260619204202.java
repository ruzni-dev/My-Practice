// Create a program to check whether a student is pass or fail based on marks.
import java.util.Scanner; // Import Scanner for reading user input

public class task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter marks obtained (0-100): ");
        int marks = input.nextInt(); // Read the marks from user input

        // Check if the marks are valid and determine pass or fail
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else if (marks >= 40) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed.");
        }

        // Close the Scanner to free resources
        input.close();
    }
}