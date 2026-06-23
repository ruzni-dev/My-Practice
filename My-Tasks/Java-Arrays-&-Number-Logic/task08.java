public class task08 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 1};

        System.out.print("Array without duplicates: ");

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}