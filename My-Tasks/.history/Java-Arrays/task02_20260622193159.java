// Find the smallest element in an array.

public class task02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15}; // Initialize the array
        int smallest = arr[0]; // Assume the first element is the smallest

        // Iterate through the array to find the smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
