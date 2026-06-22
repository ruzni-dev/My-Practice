// Count the number of even and odd elements in an array.

public class task05 {
    public static void main(String[] args) {
        int[] numbers = {11, 24, 37, 42, 55, 68}; // Initialize the array with sample values
        int evenCount = 0; // Variable to count even numbers
        int oddCount = 0; // Variable to count odd numbers

        // Iterate through the array to count even and odd numbers
        for (int i = 0; i < numbers.length; i++) {
            // Check if the current element is even or odd and update the respective count
            if (numbers[i] % 2 == 0) {
                // If the number is even, increment the even count
                evenCount++;
            } else {
                // If the number is odd, increment the odd count
                oddCount++;
            }
        }

        // Print the array elements and the counts of even and odd numbers
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
