// Find the largest element in an array.

public class task01 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15}; // Initialize the array
        int largest = arr[0]; // Assume the first element is the largest

        // Iterate through the array to find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }    
}
