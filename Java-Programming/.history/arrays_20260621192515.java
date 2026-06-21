import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // 1. Declaration and initialization
        int[] numbers = {10, 20, 30, 40, 50};
        String[] fruits = new String[] {"Apple", "Banana", "Cherry"};
        double[] scores = new double[5]; // default values are 0.0

        // 2. Accessing and modifying elements
        System.out.println("numbers[0] = " + numbers[0]);
        numbers[1] = 25;
        System.out.println("Modified numbers[1] = " + numbers[1]);

        // 3. Array length
        System.out.println("Length of numbers = " + numbers.length);
        System.out.println("Length of fruits = " + fruits.length);

        // 4. Looping with for and for-each
        System.out.println("Loop with index:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("Loop with for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 5. Default values in arrays
        System.out.println("Default values in scores:");
        for (double score : scores) {
            System.out.println(score);
        }

        // 6. Multidimensional arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("matrix[1][2] = " + matrix[1][2]);

        System.out.println("Multidimensional array contents:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // 7. Jagged array (rows of different lengths)
        int[][] jagged = new int[3][];
        jagged[0] = new int[] {1, 2};
        jagged[1] = new int[] {3, 4, 5};
        jagged[2] = new int[] {6};
        System.out.println("Jagged array contents:");
        for (int[] row : jagged) {
            System.out.println(Arrays.toString(row));
        }

        // 8. Arrays utility methods
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        int[] sorted = {50, 20, 40, 10, 30};
        Arrays.sort(sorted);
        System.out.println("Sorted array: " + Arrays.toString(sorted));

        System.out.println("numbers equals copy? " + Arrays.equals(numbers, copy));
        System.out.println("numbers equals sorted? " + Arrays.equals(numbers, sorted));

        // 9. Passing arrays to methods
        double average = calculateAverage(numbers);
        System.out.println("Average of numbers = " + average);

        // 10. Returning arrays from methods
        int[] reversed = reverse(numbers);
        System.out.println("Reversed numbers: " + Arrays.toString(reversed));

        // 11. Array of objects
        Person[] people = {
            new Person("Alice", 28),
            new Person("Bob", 32)
        };
        System.out.println("People array:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static double calculateAverage(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    private static int[] reverse(int[] values) {
        if (values == null) {
            return null;
        }
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }
        return result;
    }
}

class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
