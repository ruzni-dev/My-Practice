// Find the longest word in a given sentence.

public class task10 {
    public static void main(String[] args) {
        String sentence = "Java programming is powerful"; // Input sentence
        String[] words = sentence.split(" ");   // Split the sentence into words based on spaces

        String longest = ""; // Initialize a variable to store the longest word

        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Loop through the array of words to find the longest word
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Print the longest word found in the sentence
        System.out.println("Longest word: " + longest);
    }
}