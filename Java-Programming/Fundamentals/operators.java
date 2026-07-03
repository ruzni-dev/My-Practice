public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("++a = " + (++a)); // Pre Increment
        System.out.println("--b = " + (--b)); // Pre Decrement
        System.out.println("a++ = " + (a++)); // Post Increment
        System.out.println("a = " + a); // a is now 12 after post increment
        System.out.println("b-- = " + (b--)); // Post Decrement
        System.out.println("b = " + b); // b is now 3 after post decrement

        // Assignment Operators
        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);

        int savings = 100; 
        savings += 50; // add 50 to savings
        System.out.println("\nTotal savings: " + savings);

        // Comparison Operators
        int x = 5;
        int y = 3;
        System.out.println("\nComparison Operators:");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x > y: " + (x > y)); // returns true, because 5 is higher than 3
        System.out.println("x < y: " + (x < y)); // returns false, because 5 is not lower than 3
        System.out.println("x == y: " + (x == y)); // returns false, because 5 is not equal to 3
        System.out.println("x != y: " + (x != y)); // returns true, because 5 is not equal to 3
        System.out.println("x >= y: " + (x >= y)); // returns true, because 5 is greater than or equal to 3
        System.out.println("x <= y: " + (x <= y)); // returns false, because 5 is not less than or equal to 3

        int age = 18;
        System.out.println("\nAge Comparison:");
        System.out.println("Age: " + age);
        System.out.println("Age >= 18: " + (age >= 18)); // true, old enough to vote
        System.out.println("Age < 18: " + (age < 18));  // false

        int passwordLength = 5;
        System.out.println("\nPassword Length Check:");
        System.out.println("Password Length: " + passwordLength);
        System.out.println("Password >= 8 characters: " + (passwordLength >= 8)); // false, too short
        System.out.println("Password < 8 characters: " + (passwordLength < 8));  // true, needs more characters

        //logical operators
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("\nRegular user: " + (isLoggedIn && !isAdmin)); // true, because the user is logged in and not an admin
        System.out.println("Admin user: " + (isLoggedIn && isAdmin)); // false, because the user is logged in but not an admin  
        System.out.println("Has access: " + (isLoggedIn || isAdmin)); // true, because the user is logged in or is an admin
        System.out.println("Not logged in: " + (!isLoggedIn)); // false, because the user is logged in

        //precedence of operators
        int result = 10 + 5 * 2; // multiplication has higher precedence than addition
        System.out.println("\nOperator Precedence:");   
        System.out.println("10 + 5 * 2 = " + result); // prints 20, because 5 * 2 is evaluated first
        result = (10 + 5) * 2; // parentheses change the order of evaluation
        System.out.println("(10 + 5) * 2 = " + result); // prints 30, because (10 + 5) is evaluated first
    }
}
