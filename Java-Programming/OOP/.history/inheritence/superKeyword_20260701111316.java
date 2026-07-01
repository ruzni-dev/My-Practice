// This is a simple Java program that demonstrates the use of the `super` keyword in inheritance. The `Animal` class is the base class, and the `Dog` class extends the `Animal` class. In the `Dog` class, we use the `super` keyword to call the constructor of the `Animal` class and access its methods. In the `main` method, we create an instance of the `Dog` class and observe how the `super` keyword is used to invoke methods from the parent class.

public class superKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(super.color);
        System.out.println(color);
    }
}