// Remove duplicate characters from a string while preserving order.

public class task07 {
    public static void main(String[] args) {
        String text = "programming"; // Input string
        String result = ""; // String to store the result without duplicates

        // Loop through each character in the input string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        // Print the result after removing duplicates
        System.out.println("After removing duplicates: " + result);
    }
}