// Count even and odd numbers in an array.

public class task03 {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 10, 24, 33}; // Sample array of integers

        int even = 0;
        int odd = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);
    }
}