public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}