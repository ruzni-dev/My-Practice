// Task 02 – Reverse Pattern Printing

public class task02 {
    public static void main(String[] args) {

        // Output: Reverse Pattern Printing
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}