// Search for a specific element in an array.

public class task06 {
    public static void main(String[] args) {
        int[] numbers = {14, 28, 35, 21, 42};
        int target = 35;
        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        if (found) {
            System.out.println("Element " + target + " was found at index " + foundIndex + ".");
        } else {
            System.out.println("Element " + target + " was not found in the array.");
        }
    }
}
