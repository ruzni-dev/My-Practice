// Java program to demonstrate the use of abstract class

abstract class Animal {
    abstract void sound();
}

public class withAbstract {
    public static void main(String[] args) {

        Animal a = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };

        a.sound();
    }
}