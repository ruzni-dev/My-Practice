// Book class demonstrating Encapsulation, Abstraction, and Interface
class Book extends LibraryItem implements Borrowable {

    // Private data members (Encapsulation)
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Overriding abstract method (Abstraction)
    @Override
    void displayInfo() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : Rs." + price);
    }

    // Interface methods
    @Override
    public void borrowItem() {
        System.out.println(title + " has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println(title + " has been returned.");
    }
}