// Task 04 – Right Triangle Star Pattern

public class task04 {
    public static void main(String[] args) {
        int totalRows = 5;
        
        // Output: Right Triangle Star Pattern
        for (int i = 1; i <= totalRows; i++) {
            int spaces = totalRows - i;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
