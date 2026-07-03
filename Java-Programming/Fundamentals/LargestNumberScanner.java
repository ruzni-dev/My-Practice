import java.util.Scanner;

public class LargestNumberScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println(a > b ? "A is largest" : "B is largest");
    }
}