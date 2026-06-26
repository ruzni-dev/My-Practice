// Student class demonstrating Default, Parameterized, and Copy Constructors

public class student {

    // Attributes
    private int studentId;
    private String studentName;
    private String course;

    // 1. Default Constructor
    // Initializes attributes with default values
    public student() {
        this.studentId = 0;
        this.studentName = "Not Assigned";
        this.course = "Not Assigned";
    }

    // 2. Parameterized Constructor
    // Initializes attributes with provided values
    public student(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    // 3. Copy Constructor
    // Creates a new object by copying another Student object
    public student(student otherStudent) {
        this.studentId = otherStudent.studentId;
        this.studentName = otherStudent.studentName;
        this.course = otherStudent.course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("=================================");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("=================================");
    }
}