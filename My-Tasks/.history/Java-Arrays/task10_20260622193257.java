// Rotate an array to the right by one position.

public class task10 {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55};
        int lastValue = numbers[numbers.length - 1];
        int[] rotated = new int[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {
            rotated[i + 1] = numbers[i];
        }
        rotated[0] = lastValue;

        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Array after rotating right by one position:");
        for (int number : rotated) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
