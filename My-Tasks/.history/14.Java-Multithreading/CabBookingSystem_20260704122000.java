//Design a simple Cab Booking System using multithreading in Java.

// 1. Cab Class
// The Cab class represents a cab that can be booked by customers. It has a boolean variable isAvailable to track the availability of the cab. The bookCab() method is synchronized to ensure that only one customer can book the cab at a time.
class Cab {

    private boolean isAvailable = true; // availability status (available / booked)

    public synchronized void bookCab(String customerName) {

        System.out.println(customerName + " is trying to book the cab...");

        if (isAvailable) {
            System.out.println(customerName + " successfully booked the cab.");
            isAvailable = false; // Maintain the booking status of the cab.
        } else {
            System.out.println(customerName + " failed to book the cab. Cab is already booked.");
        }
    }
}

class Customer extends Thread {

    private Cab cab;
    private String customerName;

    public Customer(Cab cab, String customerName) {
        this.cab = cab;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        cab.bookCab(customerName);
    }
}

public class CabBookingSystem {
    public static void main(String[] args) {

        Cab sharedCab = new Cab();

        // Prevent multiple customers from booking the same cab simultaneously.
        Customer customer1 = new Customer(sharedCab, "Customer 1");
        Customer customer2 = new Customer(sharedCab, "Customer 2");
        Customer customer3 = new Customer(sharedCab, "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
