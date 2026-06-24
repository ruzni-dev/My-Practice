// Find the first non-repeated character in a string.

public class task04 {
    public static void main(String[] args) {
        String text = "swiss"; // Sample string to analyze

        // Use a nested for loop to iterate through each character in the string and count its occurrences
        for (int i = 0; i < text.length(); i++) {
            int count = 0;

            // Count the occurrences of the current character in the string
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++; // Increment the count if the characters match
                }
            }

            // Check if the current character is non-repeated (count equals 1)
            if (count == 1) {
                System.out.println("First non-repeated character: " + text.charAt(i));
                break;
            }
        }
    }
}