// Parent class: Employee

public class Employee {

    protected String name;
    protected int id;

    // Method to display basic employee info
    public void displayInfo() {
        System.out.println("=================================");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}