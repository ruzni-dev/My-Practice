// Recursion

public class ex2 {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    static int product(int k) {
        if (k > 1) {
            return k * product(k - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int result1 = sum(10);
        System.out.println(result1);

        int result2 = product(10);
        System.out.println(result2);
    }
}
