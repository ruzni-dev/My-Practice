// This is a simple Java program that demonstrates multilevel inheritance. The `Animal` class is the base class, the `Dog` class extends `Animal`, and the `Puppy` class extends `Dog`. In the `main` method, we create instances of `Dog` and `Puppy` classes and call their respective methods to show how inheritance works across multiple levels.

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // Instance of Dog class, can access methods from Dog and Animal classes only
        dog1.eat();  // Method from Animal class
        dog1.bark(); // Method from Dog class
        Puppy dog2 = new Puppy(); // Instance of Puppy class, can also access methods from Puppy, Dog, and Animal classes
        dog2.eat();  // Method from Animal class
        dog2.bark(); // Method from Dog class
        dog2.weep(); // Method from Puppy class
    }
}

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}