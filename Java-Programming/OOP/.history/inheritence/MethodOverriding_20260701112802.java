//

public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method in Dog class
        dog.eat(); // Calls the inherited method from Animal class
        dog.color(); // Calls the method in Dog class
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void color() {
        System.out.println("Dog is brown");
    }
}
