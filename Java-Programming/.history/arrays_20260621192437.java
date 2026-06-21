public class arrays {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying an array element
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Looping through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
