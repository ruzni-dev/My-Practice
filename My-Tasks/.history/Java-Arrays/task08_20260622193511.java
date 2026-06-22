// Find the second largest element in an array.

public class task08 {
    public static void main(String[] args) {
        int[] numbers = {14, 55, 23, 78, 59, 78, 41};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("The array does not have a second largest unique element.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
