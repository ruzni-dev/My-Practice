public class array {
    public static void array() {
        System.out.println("Two Dimensional array: ");
        int arr[][] = {{1, 2, 3, 4},{5, 6, 7, 8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        array();
    }
}
