// Find the second largest element.

public class task06 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23}; // Sample array of integers

        int largest = Integer.MIN_VALUE; // Initialize largest with the smallest possible integer value
        int secondLargest = Integer.MIN_VALUE; // Initialize secondLargest with the smallest possible integer value

        // Iterate through the array to find the largest and second largest elements
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Print the second largest element found in the array
        System.out.println("Second largest element: " + secondLargest);
    }
}