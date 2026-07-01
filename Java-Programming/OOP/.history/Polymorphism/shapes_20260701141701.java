// This is a simple Java program that demonstrates polymorphism. The `Shape` class has a method `draw()`, which is overridden in the subclasses `Circle` and `Rectangle`. In the `main` method, we create an instance of `Shape` and assign it to different subclass objects to demonstrate polymorphism.

public class shapes {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}