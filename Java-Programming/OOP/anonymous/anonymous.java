// Anonymous class is a class that has no name and is used to instantiate objects with certain "extras" such as method overriding without having to actually subclass a class.

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

public class anonymous {
    public static void main(String[] args) {

        Animal a = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };

        a.sound();
    }
}