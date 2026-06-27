// Car class extends Vehicle and implements FuelEfficiency
class Car extends Vehicle implements FuelEfficiency {

    @Override
    void start() {
        System.out.println("Car starts with key ignition.");
    }

    @Override
    void stop() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Car Mileage: 18 km/l");
    }
}