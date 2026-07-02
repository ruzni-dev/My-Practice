// Anonymous class implementing an interface

interface Animal {
    void sound();
}

public class withInterface {
    public static void main(String[] args) {

        Animal a = new Animal() {
            public void sound() {
                System.out.println("Dog barks");
            }
        };

        a.sound();
    }
}