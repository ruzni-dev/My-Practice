// This is a simple Java program that demonstrates multilevel inheritance. The `Animal` class is the base class, the `Mammal` class extends `Animal`, and the `Dog` class extends `Mammal`. In the `main` method, we create an instance of the `Dog` class and call methods from all three classes to show how multilevel inheritance works.

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Method from Animal class
        dog.bark(); // Method from Dog class
        dog.weep(); // Method from Puppy class
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