// Task 03 – Number Pattern
// Output:
// 1
// 12
// 123
// 1234
// 12345

public class NumberPattern {
    public static void main(String[] args) {
        int totalRows = 5; // Number of rows to print

        for (int row = 1; row <= totalRows; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
