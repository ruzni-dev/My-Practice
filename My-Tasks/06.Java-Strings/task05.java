// Find all duplicate characters and their occurrence counts.

public class task05 {
    public static void main(String[] args) {
        String text = "programming"; // Input string

        System.out.println("Duplicate characters in the string '" + text + "':");

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            int count = 1; // Initialize count for the current character

            if (text.charAt(i) == '0') continue; // Skip if the character is already counted

            // Loop through the remaining characters to count occurrences
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            // Mark the character as counted by replacing it with '0'
            if (count > 1) {
                System.out.println(text.charAt(i) + " occurs " + count + " times");
            }
        }
    }
}