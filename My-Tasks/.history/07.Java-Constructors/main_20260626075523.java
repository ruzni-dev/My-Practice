// Main class to test Student constructors

public class main {
    public static void main(String[] args) {

        // Student using default constructor
        student student1 = new student();

        // Student using parameterized constructor
        student student2 = new student(101, "Alice Johnson", "Software Engineering");

        // Student using copy constructor
        student student3 = new student(student2);

        // Display all student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("Student 2 Details:");
        student2.displayDetails();

        System.out.println("Student 3 Details (Copy of Student 2):");
        student3.displayDetails();
    }
}