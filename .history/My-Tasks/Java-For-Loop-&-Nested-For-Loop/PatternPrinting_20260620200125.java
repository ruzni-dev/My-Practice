// Task 01 – Pattern Printing
// Output:
// *
// **
// ***
// ****
// *****

public class PatternPrinting {
    public static void main(String[] args) {
        int totalRows = 5; // Number of rows to print

        for (int row = 1; row <= totalRows; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
