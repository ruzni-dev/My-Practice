// Reverse the order of words in a sentence without reversing the words themselves.

public class task09 {
    public static void main(String[] args) {
        String sentence = "Java is powerful"; // Input sentence
        String[] words = sentence.split(" "); // Split the sentence into words based on spaces

        System.out.print("Reversed sentence: "); // Print the reversed order of words

        // Loop through the array of words in reverse order and print each word
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}