public class array {
    public static void array1() {
        System.out.println("One Dimensional array: ");
        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void array2() {
        System.out.println("Two Dimensional array: ");
        int arr[][] = {{1, 2, 3, 4},{5, 6, 7, 8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        array2();
    }
}
