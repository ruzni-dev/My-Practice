public class javaVariables {
    public static void main(String[] args) {
        // Declaring and initializing variables
        String name = "John";
        System.out.println("Hello " + name);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        int z = 50; 
        System.out.println(x + y); // Print the value of x + y
        System.out.println("The sum is " + x + y);   // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11
        System.out.println(x + y + z); // 61

        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c); // 61

        int s, t, u;
        s = t = u = 50;
        System.out.println(s + t + u); // 150
    }
}
