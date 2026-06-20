// Task 02 – Reverse Pattern Printing
// Output:
// *****
// ****
// ***
// **
// *

public class ReversePatternPrinting {
    public static void main(String[] args) {
        int totalRows = 5; // Number of rows to print

        for (int row = totalRows; row >= 1; row--) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
