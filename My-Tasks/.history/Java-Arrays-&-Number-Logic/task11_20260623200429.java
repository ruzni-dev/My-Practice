// Check whether a number is Armstrong (use while loop).

public class task11 {
    public static void main(String[] args) {
        int number = 153; // Sample number to check for Armstrong
        int original = number; // Store the original number for later comparison
        int sum = 0; // Initialize a variable to hold the sum of cubes of digits

        // Reverse the number by extracting digits and calculating the sum of cubes of digits
        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number /= 10;
        }

        // Compare the original number with the sum of cubes of its digits to determine if it is an Armstrong number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number"); // If the original number is equal to the sum of cubes of its digits, print that it is an Armstrong number
        } else {
            System.out.println(original + " is not an Armstrong number"); // If the original number is not equal to the sum of cubes of its digits, print that it is not an Armstrong number
        }
    }
}