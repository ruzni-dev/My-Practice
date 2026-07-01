// This is a simple Java program that demonstrates abstraction. The `Animal` class is an abstract class with an abstract method `sound()`. The `Dog` class extends the `Animal` class and provides an implementation for the `sound()` method. In the `main` method, we create an instance of `Dog` and call its methods.

abstract class Animal {
    abstract void sound();  // abstract method

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class anml {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.sound();
        a.sleep();
    }
}
