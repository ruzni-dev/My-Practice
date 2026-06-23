// Print array elements in reverse order.

public class task05 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Sample array of integers

        // Print the elements of the array in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}