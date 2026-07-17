import java.util.ArrayList;
import java.util.Scanner;

class Product {

    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return price * quantity;
    }

    public void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + totalPrice());
    }
}

public class ShoppingCartSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Shopping Cart =====");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Bill");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    cart.add(new Product(id, name, price, qty));

                    System.out.println("Product Added.");
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int remove = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).id == remove) {
                            cart.remove(i);
                            removed = true;
                            System.out.println("Product Removed.");
                            break;
                        }
                    }

                    if (!removed)
                        System.out.println("Product Not Found.");

                    break;

                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Cart is Empty.");
                    } else {
                        for (Product p : cart)
                            p.display();
                    }
                    break;

                case 4:
                    double total = 0;

                    for (Product p : cart)
                        total += p.totalPrice();

                    double discount = 0;

                    if (total > 10000)
                        discount = total * 0.10;

                    System.out.println("Total Bill : " + total);
                    System.out.println("Discount   : " + discount);
                    System.out.println("Final Bill : " + (total - discount));

                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}