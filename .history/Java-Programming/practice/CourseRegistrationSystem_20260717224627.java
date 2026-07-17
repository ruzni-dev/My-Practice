import java.util.ArrayList;
import java.util.Scanner;

class Course {

    int courseId;
    String courseName;
    int maxStudents;
    int enrolledStudents;

    public Course(int courseId, String courseName, int maxStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.enrolledStudents = 0;
    }

    public void registerStudent() {
        if (enrolledStudents < maxStudents) {
            enrolledStudents++;
            System.out.println("Student Registered Successfully.");
        } else {
            System.out.println("Course is Full.");
        }
    }

    public void display() {
        System.out.println("\nCourse ID : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Maximum Students : " + maxStudents);
        System.out.println("Enrolled Students : " + enrolledStudents);
        System.out.println("----------------------------");
    }
}

public class CourseRegistrationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Course Registration System =====");
            System.out.println("1. Add Course");
            System.out.println("2. Register Student");
            System.out.println("3. Display Courses");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Course ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course Name: ");
                    String name = sc.nextLine();

                    System.out.print("Maximum Students: ");
                    int max = sc.nextInt();

                    courses.add(new Course(id, name, max));
                    System.out.println("Course Added Successfully.");
                    break;

                case 2:
                    System.out.print("Enter Course ID: ");
                    int registerId = sc.nextInt();

                    boolean found = false;

                    for (Course c : courses) {
                        if (c.courseId == registerId) {
                            c.registerStudent();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Course Not Found.");

                    break;

                case 3:
                    if (courses.isEmpty()) {
                        System.out.println("No Courses Available.");
                    } else {
                        for (Course c : courses)
                            c.display();
                    }
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}