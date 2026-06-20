// Create a program to display month names using switch statement.
import java.util.Scanner; // Import Scanner for reading user input

public class task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input from the console

        System.out.print("Enter a month number (1-12): ");
        int month = input.nextInt(); // Read an integer from the user representing the month number

        // Use a switch statement to determine the month name based on the month number
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number. Please enter a value between 1 and 12.");
                break;
        }

        // Close the Scanner to free resources
        input.close();
    }
}