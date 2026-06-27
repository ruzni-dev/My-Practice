// Bike class extends Vehicle and implements FuelEfficiency
class Bike extends Vehicle implements FuelEfficiency {

    @Override
    void start() {
        System.out.println("Bike starts with self-start button.");
    }

    @Override
    void stop() {
        System.out.println("Bike engine stopped.");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Bike Mileage: 45 km/l");
    }
}