// Reverse an array without using built-in methods.

public class task07 {
    public static void main(String[] args) {
        int[] original = {2, 4, 6, 8, 10, 12}; // Initialize the original array
        int[] reversed = new int[original.length]; // Create a new array to hold the reversed elements

        // Copy elements from the original array to the reversed array in reverse order
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Print the original array
        System.out.println("Original array:");
        for (int value : original) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int value : reversed) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
