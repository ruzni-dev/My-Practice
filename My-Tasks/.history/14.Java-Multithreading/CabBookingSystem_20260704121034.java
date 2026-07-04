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

public class CabBookingSystem {
    
}
