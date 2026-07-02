enum OrderStatus {
    PENDING,
    PREPARING,
    OUT_FOR_DELIVERY,
    DELIVERED
}

abstract class Person {
    private String name;

    Person(String name) {   // Constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void role();
}

class Customer extends Person {
    private String address;

    Customer(String name, String address) {
        super(name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    void role() {
        System.out.println("Role: Customer");
    }
}

class DeliveryRider extends Person {

    DeliveryRider(String name) {
        super(name);
    }

    void role() {
        System.out.println("Role: Delivery Rider");
    }

    void deliver() {
        System.out.println(getName() + " is delivering food");
    }
}

class Payment {
    void pay() {
        System.out.println("Payment processing...");
    }
}

class CashPayment extends Payment {
    void pay() {
        System.out.println("Paid using Cash");
    }
}

class CardPayment extends Payment {
    void pay() {
        System.out.println("Paid using Card");
    }
}

public class Main {
    public static void main(String[] args) {

        OrderStatus status = OrderStatus.PREPARING;
        System.out.println("Order Status: " + status);

        Customer customer = new Customer("Ruzni", "Colombo");
        customer.role();

        DeliveryRider rider = new DeliveryRider("Ali");
        rider.role();
        rider.deliver();

        Payment payment;

        payment = new CashPayment();
        payment.pay();

        payment = new CardPayment();
        payment.pay();

        // Anonymous Class
        Payment specialPayment = new Payment() {
            void pay() {
                System.out.println("Special Discount Payment Applied");
            }
        };

        specialPayment.pay();
    }
}
