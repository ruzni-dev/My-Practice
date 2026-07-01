// This is a simple Java program that demonstrates inheritance. The `Animal` class is the parent class, and the `Dog` class is the child class that inherits from `Animal`.

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

public class inheritence {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
    }
}