// Child class: FullTimeEmployee

public class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    // Salary calculation for full-time employee
    public double calculateSalary() {
        return monthlySalary;
    }

    public void displayFullTimeDetails() {
        displayInfo();
        System.out.println("Employment Type: Full-Time");
        System.out.println("Monthly Salary  : ₹" + calculateSalary());
        System.out.println("=================================");
    }
}