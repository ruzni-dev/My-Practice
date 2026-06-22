// Search for a specific element in an array.

public class task06 {
    public static void main(String[] args) {
        int[] numbers = {14, 28, 35, 21, 42}; // Initialize the array with sample values
        int target = 35; // The element we want to search for
        boolean found = false; // Variable to track if the target element is found
        int foundIndex = -1; // Variable to store the index of the found element, initialized to -1 to indicate not found

        // Iterate through the array to search for the target element
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        // Print the array elements
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Print the result of the search
        if (found) {
            // If the target element is found, print its index
            System.out.println("Element " + target + " was found at index " + foundIndex + ".");
        } else {
            // If the target element is not found, print a message indicating it was not found
            System.out.println("Element " + target + " was not found in the array.");
        }
    }
}
