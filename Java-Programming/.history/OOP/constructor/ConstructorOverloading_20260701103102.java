// Constructor Overloading in Java

public class ConstructorOverloading {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming");
        Book b3 = new Book("Python Programming", 29.99);

        b1.display();
        b2.display();
        b3.display();
    }
}

class Book {
    String name;
    double price;

    Book() {
        name = "Unknown";
        price = 0;
    }

    Book(String n) {
        name = n;
        price = 0;
    }

    Book(String n, double p) {
        name = n;
        price = p;
    }

    void display() {
        System.out.println(name + " " + price);
    }
}