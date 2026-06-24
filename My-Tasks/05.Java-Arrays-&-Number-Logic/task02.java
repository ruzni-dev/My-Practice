// Find the smallest element in an array.

public class task02 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23}; // Sample array of integers

        int smallest = numbers[0]; // Initialize smallest with the first element of the array

        // Iterate through the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            // Compare each element with the current smallest and update if a smaller element is found
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Print the smallest element found in the array
        System.out.println("Smallest element: " + smallest);
    }
}