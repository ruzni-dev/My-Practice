import java.util.Scanner;

public class array {
    public static void display(int N) {
        System.out.print("Print numbers: ");
        for (int i = 0; i < N; i++) {
            System.out.print(i);
        }
    }

    public static void array1() {
        System.out.println("One Dimensional array: ");
        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void array2() {
        System.out.println("\nTwo Dimensional array: ");
        int arr[][] = {{1, 2, 3, 4},{5, 6, 7, 8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();

        display(N);
        array1();
        array2();
    }
}
