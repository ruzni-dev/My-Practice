public class DigitCounter {
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Digits = " + count);
    }
}