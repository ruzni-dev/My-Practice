// Count even and odd numbers in an array.

public class task03 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 10, 24, 33}; // Sample array of integers

        int even = 0; // Initialize counters for even and odd numbers
        int odd = 0; // Initialize counters for even and odd numbers

        // Iterate through the array to count even and odd numbers
        for (int num : numbers) {
            // Check if the number is even or odd and update the respective counter
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Print the counts of even and odd numbers
        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);
    }
}