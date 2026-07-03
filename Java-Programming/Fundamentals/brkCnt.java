public class brkCnt {
    public static void main(String[] args) {
        // This loop will break when i equals 5
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("Current value of i: " + i);
        }

        // This loop will continue to the next iteration when j equals 3
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Skipping the iteration at j = " + j);
                continue; // Skip the rest of the loop when j is 3
            }
            System.out.println("Current value of j: " + j);
        }
    }
}
