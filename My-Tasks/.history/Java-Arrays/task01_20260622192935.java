// Find the largest element in an array.

public class task01 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 15};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }    
}
