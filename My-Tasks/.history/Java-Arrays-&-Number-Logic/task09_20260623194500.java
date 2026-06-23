// Check whether a number is Prime.

public class task09 {
    public static void main(String[] args) {
        int number = 17; // Sample number to check for primality
        boolean isPrime = true; // Assume the number is prime until proven otherwise

        // Check if the number is less than or equal to 1, which are not prime numbers
        if (number <= 1) {
            isPrime = false; // Mark as not prime
        } else {
            // Iterate from 2 to the square root of the number to check for factors
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result based on the primality check
        if (isPrime) {
            System.out.println(number + " is a Prime number"); // If the number is prime, print that it is a prime number
        } else {    
            System.out.println(number + " is not a Prime number"); // If the number is not prime, print that it is not a prime number
        }
    }
}