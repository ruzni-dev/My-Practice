// Count the number of vowels, consonants, digits, and special characters in a string.

public class task03 {
    public static void main(String[] args) {
        String text = "Hello123@"; // Sample string to analyze
        int vowels = 0, consonants = 0, digits = 0, special = 0; // Initialize counters for vowels, consonants, digits, and special characters

        // Use a for loop to iterate through each character in the string and classify it
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            // Classify each character
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // Increment the vowel counter if the character is a vowel
                } else {
                    consonants++; // Increment the consonant counter if the character is a consonant
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++; // Increment the digit counter if the character is a digit
            } else {
                special++; // Increment the special character counter if the character is neither a letter nor a digit
            }
        }

        // Print the counts of vowels, consonants, digits, and special characters to the console
        System.out.println("Original String: " + text);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}