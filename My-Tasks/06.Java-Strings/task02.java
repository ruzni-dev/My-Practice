// Check whether a string is a palindrome.

public class task02 {
    public static void main(String[] args) {
        String text = "madam"; // Sample string to check for palindrome
        String reversed = ""; // Initialize an empty string to hold the reversed string

        // 
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // Print the text is a palindrome or not based on the comparison of the original and reversed strings
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println(text + " is a Palindrome"); // Check if the original string is equal to the reversed string (case-insensitive)
        } else {
            System.out.println(text + " is not a Palindrome"); // If not equal, print that it is not a palindrome
        }
    }
}