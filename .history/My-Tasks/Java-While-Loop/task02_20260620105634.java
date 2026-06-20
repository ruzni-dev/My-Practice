// Print all odd numbers between 1 and 50.
public class task02 {
    public static void main(String[] args) { 
        System.out.println("Odd numbers from 1 to 50:");

        // Use a while loop to iterate through numbers from 1 to 50
        int number = 1;
        while (number <= 50) {
            // Check if the number is odd
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++; // Increment the number
        }
    }
}
