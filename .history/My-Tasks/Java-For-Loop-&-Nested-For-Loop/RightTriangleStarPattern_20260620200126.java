// Task 04 – Right Triangle Star Pattern
// Output:
//     *
//    ***
//   *****
//  *******
// *********

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        int totalRows = 5; // Number of rows in the triangle

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
    }
}
