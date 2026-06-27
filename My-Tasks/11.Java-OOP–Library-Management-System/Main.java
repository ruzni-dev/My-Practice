public class Main {
    public static void main(String[] args) {

        // Encapsulation using setters
        Book book1 = new Book();
        book1.setBookId(101);
        book1.setTitle("Java Programming");
        book1.setAuthor("James Gosling");
        book1.setPrice(1500);

        // Inheritance
        Student student = new Student("Mohamad Ruzni", 1);
        Librarian librarian = new Librarian("Alice", 2);

        // Display Book Details
        System.out.println("===== Book Details =====");
        book1.displayInfo();

        System.out.println();

        // Display Student Details
        System.out.println("===== Student Details =====");
        student.displayPersonInfo();

        System.out.println();

        // Display Librarian Details
        System.out.println("===== Librarian Details =====");
        librarian.displayPersonInfo();

        System.out.println();

        // Polymorphism
        System.out.println("===== Polymorphism Demo =====");
        LibraryItem item = new Book();
        Book polyBook = (Book) item;
        polyBook.setBookId(202);
        polyBook.setTitle("OOP Concepts");
        polyBook.setAuthor("John Doe");
        polyBook.setPrice(2000);
        item.displayInfo();

        System.out.println();

        // Interface Implementation
        System.out.println("===== Borrowable Demo =====");
        student.borrowItem();
        book1.borrowItem();

        student.returnItem();
        book1.returnItem();
    }
}