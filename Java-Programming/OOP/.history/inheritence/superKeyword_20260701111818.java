// This is a simple Java program that demonstrates the use of the `super` keyword in inheritance. The `Animal` class is the base class, and the `Dog` class extends the `Animal` class. In the `Dog` class, we use the `super` keyword to call the constructor of the `Animal` class and access its methods. In the `main` method, we create an instance of the `Dog` class and observe how the `super` keyword is used to invoke methods from the parent class.

public class superKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
        Cat cat = new Cat();
        cat.printColor();
    }
}

class Animal {
    String color = "White";
}

class Dog extends Animal {
    void printColor() {
        System.out.println(super.color); // Accessing the color attribute from the parent class (Animal) using super
        System.out.println(color); // Accessing the color attribute from the current class (Dog), but since Dog does not have its own color attribute, it will access the color from the parent class (Animal)
    }
}

class Cat extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(super.color);// Accessing the color attribute from the parent class (Animal) using super
        System.out.println(color);  // Accessing the color attribute from the current class (Cat), which has its own color attribute
    }
}