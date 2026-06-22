// Remove duplicate elements from an array.

public class task09 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 5, 18, 12, 7, 18, 7}; // Initialize the array with sample values, including duplicates
        int[] unique = new int[numbers.length]; // Create an array to store unique elements, with the same length as the original array
        int uniqueCount = 0; // 

        // 
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (numbers[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

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
