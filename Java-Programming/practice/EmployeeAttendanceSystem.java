import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;
    int presentDays;

    public Employee(int id, String name, String department, int presentDays) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.presentDays = presentDays;
    }

    public double attendancePercentage(int totalWorkingDays) {
        return (presentDays * 100.0) / totalWorkingDays;
    }

    public void display(int totalWorkingDays) {

        double percentage = attendancePercentage(totalWorkingDays);

        System.out.println("\nEmployee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Present Days: " + presentDays);
        System.out.printf("Attendance  : %.2f%%\n", percentage);

        if (percentage >= 75)
            System.out.println("Status      : Eligible");
        else
            System.out.println("Status      : Warning");

        System.out.println("----------------------------");
    }
}

public class EmployeeAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter Total Working Days: ");
        int totalWorkingDays = sc.nextInt();

        while (true) {

            System.out.println("\n===== Employee Attendance System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Attendance Report");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Department: ");
                    String department = sc.nextLine();

                    System.out.print("Present Days: ");
                    int days = sc.nextInt();

                    employees.add(new Employee(id, name, department, days));

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No Employee Records.");
                    } else {
                        for (Employee e : employees)
                            e.display(totalWorkingDays);
                    }
                    break;

                case 3:
                    System.out.println("Program Closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}