//

public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method in Dog class
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
