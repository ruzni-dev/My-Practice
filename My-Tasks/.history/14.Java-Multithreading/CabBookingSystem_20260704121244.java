public class Cab {

    private boolean isAvailable = true;

    public synchronized void bookCab(String customerName) {

        System.out.println(customerName + " is trying to book the cab...");

        if (isAvailable) {
            System.out.println(customerName + " successfully booked the cab.");
            isAvailable = false;
        } else {
            System.out.println(customerName + " failed to book the cab. Cab is already booked.");
        }
    }
}

public class Customer extends Thread {

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

        Customer customer1 = new Customer(sharedCab, "Customer 1");
        Customer customer2 = new Customer(sharedCab, "Customer 2");
        Customer customer3 = new Customer(sharedCab, "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
