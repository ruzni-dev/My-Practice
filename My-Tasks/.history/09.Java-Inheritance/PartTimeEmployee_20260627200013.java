// Child class: PartTimeEmployee

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Salary calculation for part-time employee
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void displayPartTimeDetails() {
        displayInfo();
        System.out.println("Employment Type: Part-Time");
        System.out.println("Hours Worked   : " + hoursWorked);
        System.out.println("Hourly Rate    : Rs." + hourlyRate);
        System.out.println("Total Salary    : Rs." + calculateSalary());
        System.out.println("=================================");
    }
}