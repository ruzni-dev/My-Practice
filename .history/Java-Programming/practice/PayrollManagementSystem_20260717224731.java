import java.util.ArrayList;
import java.util.Scanner;

class Staff {

    int employeeId;
    String employeeName;
    double basicSalary;

    public Staff(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double calculateAllowance() {
        return basicSalary * 0.20;
    }

    public double calculateSalary() {
        return basicSalary + calculateAllowance();
    }

    public void display() {
        System.out.println("\nEmployee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Allowance : " + calculateAllowance());
        System.out.println("Net Salary : " + calculateSalary());
        System.out.println("----------------------------");
    }
}

public class PayrollManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Staff> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Payroll Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Payroll");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Basic Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Staff(id, name, salary));

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No Employee Records.");
                    } else {
                        for (Staff s : employees)
                            s.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Staff s : employees) {
                        if (s.employeeId == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");

                    break;

                case 4:
                    System.out.println("Program Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}