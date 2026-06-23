// Reverse an array.

public class task04 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Sample array of integers
        int[] reversed = new int[numbers.length]; // Create a new array to hold the reversed elements

        int j = 0; // Initialize an index for the reversed array
        // Iterate through the original array in reverse order to fill the reversed array
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[j] = numbers[i]; // Assign elements from the original array to the reversed array in reverse order
            j++;
        }

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}