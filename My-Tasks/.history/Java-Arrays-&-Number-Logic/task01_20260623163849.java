// Find the largest element in an array.

public class task01 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23}; // Sample array of integers

        int largest = numbers[0]; // Initialize largest with the first element of the array

        // Iterate through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            // Compare each element with the current largest and update if a larger element is found
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print the largest element found in the array
        System.out.println("Largest element: " + largest);
    }
}
