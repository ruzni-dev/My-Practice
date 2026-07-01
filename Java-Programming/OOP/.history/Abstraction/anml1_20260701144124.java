// This is a simple Java program that demonstrates abstraction using interfaces. The `Animal` interface has a method `sound()`, which is implemented in the `Dog` class. In the `main` method, we create an instance of `Dog` and call its `sound()` method through the `Animal` interface reference.

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class anml1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
