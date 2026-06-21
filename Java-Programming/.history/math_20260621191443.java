public class math {
    public static void main(String[] args) {
        // Basic Math Operations
        int a = 10;
        int b = 5;

        System.out.println("Basic Math Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Using Math class
        double x = 16.0;
        double y = 3.0;

        System.out.println("\nUsing Math class:");
        System.out.println("Square root of " + x + ": " + Math.sqrt(x));
        System.out.println("Power of " + x + " and " + y + ": " + Math.pow(x, y));
        System.out.println("Maximum of " + x + " and " + y + ": " + Math.max(x, y));
        System.out.println("Minimum of " + x + " and " + y + ": " + Math.min(x, y));
        System.out.println("Absolute value of -5: " + Math.abs(-5));
        System.out.println("Random number between 0 and 100: " + (Math.random() * 101));

        // Rounding, Ceiling, and Floor
        double z = 5.7;
        System.out.println("\nRounding, Ceiling, and Floor:");
        System.out.println("Rounded value of " + z + ": " + Math.round(z));
        System.out.println("Ceiling of " + z + ": " + Math.ceil(z));
        System.out.println("Floor of " + z + ": " + Math.floor(z));
    }
}
