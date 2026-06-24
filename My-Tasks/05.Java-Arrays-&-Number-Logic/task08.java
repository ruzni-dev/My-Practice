// Remove duplicate elements from an array.

public class task08 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 1}; // Sample array of integers with duplicates

        // Print the original array
        System.out.print("Array with duplicates: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print the array without duplicates
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            // Check if the current element has already appeared in the array
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If the current element is not a duplicate, print it
            if (!isDuplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}