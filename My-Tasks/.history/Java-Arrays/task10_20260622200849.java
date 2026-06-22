// Rotate an array to the right by one position.

public class task10 {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55}; // Initialize the array with sample values
        int lastValue = numbers[numbers.length - 1]; // Store the last element of the array, which will be moved to the front after rotation
        int[] rotated = new int[numbers.length]; // Create a new array to hold the rotated values, with the same length as the original array

        // Shift elements to the right by one position
        for (int i = 0; i < numbers.length - 1; i++) {
            rotated[i + 1] = numbers[i];
        }
        rotated[0] = lastValue;

        // Print the original and rotated arrays
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Array after rotating right by one position:");
        for (int number : rotated) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
