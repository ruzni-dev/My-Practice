// Count the frequency of each character in a string.

public class task08 {
    public static void main(String[] args) {
        String text = "hello"; // Input string

        System.out.println("Character frequency in the string '" + text + "':");

        // Loop through each character in the string to count its frequency
        for (int i = 0; i < text.length(); i++) {
            int count = 1;
            boolean visited = false;

            for (int k = 0; k < i; k++) {
                if (text.charAt(i) == text.charAt(k)) {
                    visited = true;
                    break;
                }
            }

            if (visited) continue;

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            System.out.println(text.charAt(i) + " = " + count);
        }
    }
}