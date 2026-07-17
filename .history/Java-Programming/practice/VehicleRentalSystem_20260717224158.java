import java.util.ArrayList;
import java.util.Scanner;

class Vehicle {

    int id;
    String name;
    String type;
    double rentPerDay;
    boolean available;

    public Vehicle(int id, String name, String type, double rentPerDay) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.rentPerDay = rentPerDay;
        this.available = true;
    }

    public void display() {
        System.out.println("\nVehicle ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Type       : " + type);
        System.out.println("Rent/Day   : " + rentPerDay);
        System.out.println("Status     : " + (available ? "Available" : "Rented"));
        System.out.println("---------------------------");
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Vehicle Rental System =====");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Rent Vehicle");
            System.out.println("4. Return Vehicle");
            System.out.println("5. Calculate Rental Cost");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Vehicle ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Vehicle Name: ");
                    String name = sc.nextLine();

                    System.out.print("Vehicle Type: ");
                    String type = sc.nextLine();

                    System.out.print("Rent Per Day: ");
                    double rent = sc.nextDouble();

                    vehicles.add(new Vehicle(id, name, type, rent));
                    System.out.println("Vehicle Added Successfully.");
                    break;

                case 2:
                    if (vehicles.isEmpty()) {
                        System.out.println("No Vehicles Available.");
                    } else {
                        for (Vehicle v : vehicles)
                            v.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter Vehicle ID: ");
                    int rentId = sc.nextInt();

                    boolean found = false;

                    for (Vehicle v : vehicles) {
                        if (v.id == rentId) {
                            found = true;
                            if (v.available) {
                                v.available = false;
                                System.out.println("Vehicle Rented Successfully.");
                            } else {
                                System.out.println("Vehicle Already Rented.");
                            }
                        }
                    }

                    if (!found)
                        System.out.println("Vehicle Not Found.");

                    break;

                case 4:
                    System.out.print("Enter Vehicle ID: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (Vehicle v : vehicles) {
                        if (v.id == returnId) {
                            found = true;
                            v.available = true;
                            System.out.println("Vehicle Returned Successfully.");
                        }
                    }

                    if (!found)
                        System.out.println("Vehicle Not Found.");

                    break;

                case 5:
                    System.out.print("Enter Vehicle ID: ");
                    int vehicleId = sc.nextInt();

                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();

                    found = false;

                    for (Vehicle v : vehicles) {
                        if (v.id == vehicleId) {
                            found = true;
                            double total = days * v.rentPerDay;
                            System.out.println("Total Rental Cost: " + total);
                        }
                    }

                    if (!found)
                        System.out.println("Vehicle Not Found.");

                    break;

                case 6:
                    System.out.println("Program Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}