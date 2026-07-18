import java.util.ArrayList;
import java.util.Scanner;

class FoodItem {

    int id;
    String name;
    double price;
    int quantity;

    public FoodItem(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public void display() {
        System.out.println("\nItem ID   : " + id);
        System.out.println("Food Name : " + name);
        System.out.println("Price     : Rs. " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total     : Rs. " + getTotal());
        System.out.println("----------------------------");
    }
}

public class RestaurantOrderManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<FoodItem> orders = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Restaurant Order Management System =====");
            System.out.println("1. Add Order");
            System.out.println("2. View Orders");
            System.out.println("3. Update Quantity");
            System.out.println("4. Remove Order");
            System.out.println("5. Generate Bill");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Food Name: ");
                    String name = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    orders.add(new FoodItem(id, name, price, qty));
                    System.out.println("Order Added Successfully.");
                    break;

                case 2:

                    if (orders.isEmpty()) {
                        System.out.println("No Orders Found.");
                    } else {
                        for (FoodItem item : orders) {
                            item.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Item ID: ");
                    int updateId = sc.nextInt();

                    boolean found = false;

                    for (FoodItem item : orders) {

                        if (item.id == updateId) {

                            System.out.print("New Quantity: ");
                            item.quantity = sc.nextInt();

                            found = true;
                            System.out.println("Quantity Updated.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Item Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Item ID: ");
                    int removeId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < orders.size(); i++) {

                        if (orders.get(i).id == removeId) {

                            orders.remove(i);
                            found = true;

                            System.out.println("Order Removed.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Item Not Found.");

                    break;

                case 5:

                    double subtotal = 0;

                    for (FoodItem item : orders) {
                        subtotal += item.getTotal();
                    }

                    double tax = subtotal * 0.10;
                    double finalBill = subtotal + tax;

                    System.out.println("\n========= BILL =========");
                    System.out.println("Subtotal : Rs. " + subtotal);
                    System.out.println("Tax (10%): Rs. " + tax);
                    System.out.println("Total    : Rs. " + finalBill);
                    System.out.println("========================");

                    break;

                case 6:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}