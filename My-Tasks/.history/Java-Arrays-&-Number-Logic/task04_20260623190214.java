public class task04 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];

        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[j] = numbers[i];
            j++;
        }

        System.out.print("Reversed Array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}