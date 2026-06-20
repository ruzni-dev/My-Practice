// Task 05 – Diamond Star Pattern

public class task05 {
    public static void main(String[] args) {
        int totalRows = 5;

        // Upper part
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

        // Lower part
        for (int i = totalRows - 1; i >= 1; i--) {
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
