// Remove duplicate elements from an array.

public class task09 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 5, 18, 12, 7, 18, 7}; // Initialize the array with sample values, including duplicates
        int[] unique = new int[numbers.length]; // Create an array to store unique elements, with the same length as the original array
        int uniqueCount = 0; // Variable to keep track of the number of unique elements found

        // Iterate through the original array and add unique elements to the 'unique' array
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false; // Flag to check if the current element is a duplicate
            // Check if the current element is already in the 'unique' array
            for (int j = 0; j < uniqueCount; j++) {
                // If the current element is found in the 'unique' array, set the flag to true and break the loop
                if (numbers[i] == unique[j]) {
                    isDuplicate = true; 
                    break; // Exit the inner loop early since we found a duplicate
                }
            }
            // If the current element is not a duplicate, add it to the 'unique' array and increment the unique count
            if (!isDuplicate) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        // Print the original array and the array of unique elements
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}
