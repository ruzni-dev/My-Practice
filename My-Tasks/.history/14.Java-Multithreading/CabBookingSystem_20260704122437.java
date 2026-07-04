//Design a simple Cab Booking System using multithreading in Java.

// The system allows multiple customers to try booking a cab simultaneously. The Cab class represents the cab, and the Customer class represents a customer trying to book the cab. The booking process is synchronized to ensure that only one customer can book the cab at a time.
class Cab {

    private boolean isAvailable = true; // Indicates whether the cab is available for booking

    // The bookCab method is synchronized to ensure that only one customer can book the cab at a time. It checks if the cab is available and updates its status accordingly.
    public synchronized void bookCab(String customerName) {

        System.out.println(customerName + " is trying to book the cab..."); // Print the customer trying to book the cab

        if (isAvailable) {
            System.out.println(customerName + " successfully booked the cab."); // Print the customer who successfully booked the cab
            isAvailable = false; // Mark the cab as booked
        } else {
            System.out.println(customerName + " failed to book the cab. Cab is already booked."); // Print the customer who failed to book the cab
        }
    }
}

// The Customer class extends the Thread class and represents a customer trying to book the cab. Each customer runs in its own thread.
class Customer extends Thread {

    private Cab cab; // Reference to the shared Cab object
    private String customerName; // Name of the customer

    // Constructor to initialize the Customer object with a reference to the Cab and the customer's name
    public Customer(Cab cab, String customerName) {
        this.cab = cab; // Assign the shared Cab object to the cab variable
        this.customerName = customerName; // Assign the customer's name to the customerName variable
    }

    @Override // Override the run method to define the behavior of the thread when it starts
    public void run() {
        cab.bookCab(customerName); // Call the bookCab method of the Cab object to attempt booking the cab
    }
}

public class CabBookingSystem {
    public static void main(String[] args) {

        Cab sharedCab = new Cab(); // Create a shared Cab object that will be accessed by multiple customers

        // Create multiple Customer objects, each representing a customer trying to book the cab
        Customer customer1 = new Customer(sharedCab, "Customer 1"); // Create a Customer object for Customer 1
        Customer customer2 = new Customer(sharedCab, "Customer 2"); // Create a Customer object for Customer 2
        Customer customer3 = new Customer(sharedCab, "Customer 3"); // Create a Customer object for Customer 3

        // Start the threads for each customer, allowing them to attempt booking the cab simultaneously
        customer1.start(); // Start the thread for Customer 1, which will attempt to book the cab
        customer2.start(); // Start the thread for Customer 2, which will attempt to book the cab
        customer3.start(); // Start the thread for Customer 3, which will attempt to book the cab
    }
}
