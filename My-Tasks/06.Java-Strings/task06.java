// Check whether two strings are anagrams of each other.

public class task06 {
    public static void main(String[] args) {
        String str1 = "listen"; // Input string 1
        String str2 = "silent"; // Input string 2

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int count = 0; // Initialize count for matching characters

        // Loop through each character in the first string
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i); // Get the current character from the first string

            // Loop through each character in the second string to check for a match
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        // Check if the count of matching characters is equal to the length of the strings
        if (count == str1.length()) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}