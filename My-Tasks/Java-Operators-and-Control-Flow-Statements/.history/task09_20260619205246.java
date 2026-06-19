// Create a program using switch statement to display day names based on day number
import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter a day number (1-7): ");
        int day = input.nextInt(); // Read the day number from user input

        // Use a switch statement to determine the day name based on the day number
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a value between 1 and 7.");
                break;
        }

        // Close the Scanner to free resources
        input.close();
    }
}