import java.util.Scanner;

// Enum to represent the current state of an order
enum OrderStatus {
    PENDING,
    PREPARING,
    OUT_FOR_DELIVERY,
    DELIVERED
}

// Base class for all people in the system
abstract class Person {
    private String name;

    // Constructor to initialize the person's name
    Person(String name) {
        this.name = name;
    }

    // Getter for the person's name
    public String getName() {
        return name;
    }

    // Abstract method that each subclass must define
    abstract void role();
}

// Customer class inherits from Person
class Customer extends Person {
    private String address;

    // Constructor to initialize customer details
    Customer(String name, String address) {
        super(name);
        this.address = address;
    }

    // Getter for the customer's address
    public String getAddress() {
        return address;
    }

    // Define the customer's role
    void role() {
        System.out.println("Role: Customer");
    }
}

// Delivery rider class inherits from Person
class DeliveryRider extends Person {

    // Constructor to initialize rider name
    DeliveryRider(String name) {
        super(name);
    }

    // Define the rider's role
    void role() {
        System.out.println("Role: Delivery Rider");
    }

    // Method to show the rider is delivering food
    void deliver() {
        System.out.println(getName() + " is delivering food");
    }
}

// Base class for payment methods
class Payment {
    // Default payment behavior
    void pay() {
        System.out.println("Payment processing...");
    }
}

// Cash payment implementation
class CashPayment extends Payment {
    void pay() {
        System.out.println("Paid using Cash");
    }
}

// Card payment implementation
class CardPayment extends Payment {
    void pay() {
        System.out.println("Paid using Card");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Show the initial order status
        OrderStatus status = OrderStatus.PREPARING;
        System.out.println("Order Status: " + status);

        // Take customer details from the user
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer address: ");
        String customerAddress = scanner.nextLine();

        // Take rider name from the user
        System.out.print("Enter delivery rider name: ");
        String riderName = scanner.nextLine();

        // Ask the user how they want to pay
        System.out.println("Choose payment method:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Special Discount");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        Payment payment;

        // Use different payment classes based on the user's choice
        switch (choice) {
            case 1:
                payment = new CashPayment();
                break;
            case 2:
                payment = new CardPayment();
                break;
            case 3:
                // Anonymous class for one-time special payment behavior
                payment = new Payment() {
                    @Override
                    void pay() {
                        System.out.println("Special Discount Payment Applied");
                    }
                };
                break;
            default:
                payment = new Payment();
                break;
        }
        System.out.println();

        // Create a customer object using the entered details
        Customer customer = new Customer(customerName, customerAddress);
        customer.role();
        System.out.println("Customer Address: " + customer.getAddress());

        // Create a delivery rider object
        DeliveryRider rider = new DeliveryRider(riderName);
        rider.role();
        rider.deliver();

        payment.pay();
        scanner.close();
    }
}
