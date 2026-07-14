import java.util.Scanner;

class Employee {

    int id;
    String name;
    double basicSalary;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateBonus() {
        return basicSalary * 0.10;
    }

    public double totalSalary() {
        return basicSalary + calculateBonus();
    }

    public void display() {
        System.out.println("\nEmployee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + totalSalary());
    }
}

public class EmployeeSalaryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(id, name, salary);
        }

        double highest = 0;
        Employee highestEmp = null;

        System.out.println("\n===== Employee Details =====");

        for (Employee e : emp) {

            e.display();

            if (e.totalSalary() > highest) {
                highest = e.totalSalary();
                highestEmp = e;
            }
        }

        System.out.println("\nHighest Paid Employee");
        highestEmp.display();

        sc.close();
    }
}