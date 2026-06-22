// Calculate the sum of all elements in an array.

public class task03 {
    public static void main(String[] args) {
        int[] values = {5, 12, 8, 20, 7}; // Initialize the array
        int totalSum = 0; // Variable to store the sum of elements

        // Iterate through the array to calculate the sum of all elements
        for (int i = 0; i < values.length; i++) {
            totalSum += values[i];
        }

        // Print the array values and the total sum
        System.out.println("Array values: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("The sum of all elements in the array is: " + totalSum);
    }
}
