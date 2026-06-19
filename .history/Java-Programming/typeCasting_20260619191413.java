public class typeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        // Explicit Casting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("\nExplicit Casting:");
        System.out.println("Double value: " + myDouble2);
        System.out.println("Integer value: " + myInt2);

        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
        Convert userScore to double to make sure that the division is accurate */
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);
    }
}
