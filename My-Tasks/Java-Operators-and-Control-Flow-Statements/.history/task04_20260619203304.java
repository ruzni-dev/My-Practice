import java.util.Scanner; // Import Scanner for reading user input

public class task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter age: ");
        int age = input.nextInt(); // Read the age from user input

        // Check if the age is 18 or older to determine voting eligibility
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }

        // Close the Scanner to free resources
        input.close();
    }
}
