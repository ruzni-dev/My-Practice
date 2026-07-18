import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;
    int leaveDays;
    String status;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.leaveDays = 0;
        this.status = "No Leave";
    }

    public void display() {
        System.out.println("\nEmployee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Leave Days  : " + leaveDays);
        System.out.println("Status      : " + status);
        System.out.println("-----------------------------");
    }
}

public class EmployeeLeaveManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Employee Leave Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Apply Leave");
            System.out.println("3. Approve/Reject Leave");
            System.out.println("4. View Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
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

                    employees.add(new Employee(id, name, department));

                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:

                    System.out.print("Enter Employee ID: ");
                    int leaveId = sc.nextInt();

                    boolean found = false;

                    for (Employee e : employees) {

                        if (e.id == leaveId) {

                            System.out.print("Leave Days: ");
                            e.leaveDays = sc.nextInt();

                            e.status = "Pending";

                            found = true;

                            System.out.println("Leave Applied Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int approveId = sc.nextInt();
                    sc.nextLine();

                    found = false;

                    for (Employee e : employees) {

                        if (e.id == approveId) {

                            System.out.print("Approve Leave? (Y/N): ");
                            char option = Character.toUpperCase(sc.next().charAt(0));

                            if (option == 'Y')
                                e.status = "Approved";
                            else
                                e.status = "Rejected";

                            found = true;

                            System.out.println("Leave Status Updated.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");

                    break;

                case 4:

                    if (employees.isEmpty()) {

                        System.out.println("No Employee Records.");

                    } else {

                        for (Employee e : employees) {
                            e.display();
                        }
                    }

                    break;

                case 5:

                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();

                    found = false;

                    for (Employee e : employees) {

                        if (e.id == searchId) {

                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");

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