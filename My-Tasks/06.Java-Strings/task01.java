// Reverse a given string without using built-in reverse methods.

public class task01 {
    public static void main(String[] args) {
        String text = "Hello"; // Sample string to reverse
        String reversed = ""; // Initialize an empty string to hold the reversed string

        // Use a for loop to iterate through the string in reverse order and build the reversed string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // Print the original and reversed strings to the console
        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + reversed);
    }
}