// This is a simple Java program that demonstrates polymorphism. The `MathOperations` class has multiple `add` methods with different parameter types and counts, showcasing method overloading. In the `main` method, we create an instance of the `MathOperations` class and call the different `add` methods to perform addition operations.

public class Polymorphism {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
        System.out.println(obj.add(2.5, 3.5));
    }
}

class MathOperations {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}