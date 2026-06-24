// Check whether a number is Palindrome.

public class task10 {
    public static void main(String[] args) {
        int number = 121; // Sample number to check for palindrome
        int original = number; // Store the original number for later comparison
        int reversed = 0; // Initialize a variable to hold the reversed number

        // Reverse the number by extracting digits and building the reversed number
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // Compare the original number with the reversed number to determine if it is a palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome"); // If the original number is equal to the reversed number, print that it is a palindrome
        } else {
            System.out.println(original + " is not a Palindrome"); // If the original number is not equal to the reversed number, print that it is not a palindrome
        }
    }
}