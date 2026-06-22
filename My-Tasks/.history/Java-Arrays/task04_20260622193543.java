// Calculate the average of array elements.

public class task04 {
    public static void main(String[] args) {
        int[] values = {12, 9, 15, 6, 18}; // Initialize the array
        int sum = 0; // Variable to store the sum of elements

        // Iterate through the array to calculate the sum of all elements
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        
        // Calculate the average by dividing the sum by the number of elements
        double average = (double) sum / values.length;

        // Print the array elements and the average
        System.out.println("Array elements:");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("The average of the array elements is: " + average);
    }
}
