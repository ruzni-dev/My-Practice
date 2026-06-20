// Task 05 – Diamond Star Pattern
// Output:
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class DiamondStarPattern {
    public static void main(String[] args) {
        int totalRows = 5; // Number of rows for the top half of the diamond

        // Top half of the diamond
        for (int row = 1; row <= totalRows; row++) {
            int spaces = totalRows - row;
            int stars = 2 * row - 1;

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int row = totalRows - 1; row >= 1; row--) {
            int spaces = totalRows - row;
            int stars = 2 * row - 1;

            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= stars; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
