import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (available ? "Available" : "Borrowed"));
        System.out.println("----------------------------");
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No Books Available.");
                    } else {
                        for (Book b : books)
                            b.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int borrowId = sc.nextInt();

                    boolean found = false;

                    for (Book b : books) {
                        if (b.id == borrowId) {
                            found = true;
                            if (b.available) {
                                b.available = false;
                                System.out.println("Book Borrowed.");
                            } else {
                                System.out.println("Book Already Borrowed.");
                            }
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (Book b : books) {
                        if (b.id == returnId) {
                            found = true;
                            b.available = true;
                            System.out.println("Book Returned.");
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();

                    found = false;

                    for (Book b : books) {
                        if (b.id == searchId) {
                            b.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Book Not Found.");
                    break;

                case 6:
                    System.out.println("Program Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}