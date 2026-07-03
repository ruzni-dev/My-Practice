public class ifElse {
    public static void main(String[] args) {
        int number = 10;

        // If statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }

        // If-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // If-else-if statement
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}
