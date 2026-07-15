import java.util.ArrayList;
import java.util.Scanner;

class Product {

    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("-----------------------");
    }
}

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Remove Product");
            System.out.println("6. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    products.add(new Product(id, name, qty));

                    System.out.println("Product Added.");
                    break;

                case 2:

                    if (products.isEmpty())
                        System.out.println("No Products.");

                    for (Product p : products)
                        p.display();

                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (Product p : products) {

                        if (p.id == search) {
                            p.display();
                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    int update = sc.nextInt();

                    found = false;

                    for (Product p : products) {

                        if (p.id == update) {

                            System.out.print("New Quantity: ");
                            p.quantity = sc.nextInt();

                            found = true;

                            System.out.println("Quantity Updated.");
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Product ID: ");
                    int remove = sc.nextInt();

                    found = false;

                    for (int i = 0; i < products.size(); i++) {

                        if (products.get(i).id == remove) {

                            products.remove(i);

                            found = true;

                            System.out.println("Product Removed.");

                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found.");

                    break;

                case 6:

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}