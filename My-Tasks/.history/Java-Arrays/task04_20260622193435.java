// Calculate the average of array elements.

public class task04 {
    public static void main(String[] args) {
        int[] values = {12, 9, 15, 6, 18};
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        double average = (double) sum / values.length;

        System.out.println("Array elements:");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("The average of the array elements is: " + average);
    }
}
