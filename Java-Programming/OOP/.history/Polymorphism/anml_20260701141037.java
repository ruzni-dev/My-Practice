// This is a simple Java program that demonstrates polymorphism. The `Animal` class has a method `sound()`, which is overridden in the subclasses `Dog` and `Cat`. In the `main` method, we create an instance of `Animal` and assign it to different subclass objects to demonstrate polymorphism.

public class anml {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}