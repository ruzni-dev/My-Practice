import java.util.Scanner;

public class CalculatorScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();

        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println("Add = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Mul = " + (a * b));
        System.out.println("Div = " + (a / b));
    }
}