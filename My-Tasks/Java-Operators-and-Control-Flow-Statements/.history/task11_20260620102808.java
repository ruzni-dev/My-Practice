// Create a program to check whether a character is a vowel or consonant
import java.util.Scanner; // Import the Scanner class to read user input

public class task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter a character: ");
        char ch = input.next().toLowerCase().charAt(0); // Read the character from user input and convert it to lowercase

        // Check if the character is a letter, and then determine if it's a vowel or consonant
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter a letter.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        // Close the Scanner to free resources
        input.close();
    }
}