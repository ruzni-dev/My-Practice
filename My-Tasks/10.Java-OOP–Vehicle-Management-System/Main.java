// Main class to test Vehicle Management System
public class Main {
    public static void main(String[] args) {

        // Create Car object
        Car car = new Car();

        System.out.println("===== Car Details =====");
        car.start();
        car.calculateMileage();
        car.stop();

        System.out.println();

        // Create Bike object
        Bike bike = new Bike();

        System.out.println("===== Bike Details =====");
        bike.start();
        bike.calculateMileage();
        bike.stop();
    }
}