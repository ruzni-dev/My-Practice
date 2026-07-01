// This is a simple Java program that demonstrates constructor chaining. The `ConstructorChaining` class has multiple constructors that call each other using the `this()` keyword. In the `main` method, we create an instance of the `ConstructorChaining` class and observe how the constructors are called in sequence.

public class ConstructorChaining {
    
}

class Student {
    Student() {
        this("Ruzni");
        System.out.println("Default Constructor");
    }

    Student(String name) {
        System.out.println(name);
    }
}