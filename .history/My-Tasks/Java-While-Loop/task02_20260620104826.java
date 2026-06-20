public class task02 {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Odd numbers from 1 to 50:");
        while (number <= 50) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
