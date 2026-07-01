// This is a simple Java program that demonstrates hierarchical inheritance. The `Animal` class is the base class, and the `Dog` and `Cat` classes extend the `Animal` class. In the `main` method, we create instances of both `Dog` and `Cat` classes and call their respective methods to show how hierarchical inheritance works.

public class HierarchicalInheritance {
    
}

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    void chirp() {
        System.out.println("Bird chirps");
    }
}
