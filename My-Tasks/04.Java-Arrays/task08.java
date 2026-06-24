// Find the second largest element in an array.

public class task08 {
    public static void main(String[] args) {
        int[] numbers = {14, 55, 23, 78, 59, 78, 41}; // Initialize the array with sample values
        int largest = numbers[0]; // Variable to store the largest element, initialized to the first element
        int secondLargest = Integer.MIN_VALUE; // Variable to store the second largest element, initialized to the first element

        // Iterate through the array to find the largest and second largest elements
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }

        // Print the array elements
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Check if the second largest element was updated and print the result
        if (secondLargest == Integer.MIN_VALUE) {
            // If the second largest element is still Integer.MIN_VALUE, it means there was no second largest unique element in the array
            System.out.println("The array does not have a second largest unique element.");
        } else {
            // If the second largest element was updated, print its value
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
