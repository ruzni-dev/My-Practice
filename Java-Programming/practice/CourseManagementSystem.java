import java.util.ArrayList;
import java.util.Scanner;

class Course {

    private int courseId;
    private String courseName;
    private String lecturer;
    private int credits;

    public Course(int courseId, String courseName, String lecturer, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.credits = credits;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void display() {
        System.out.println("\n--------------------------");
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Lecturer    : " + lecturer);
        System.out.println("Credits     : " + credits);
    }
}

public class CourseManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Course Management System =====");
            System.out.println("1. Add Course");
            System.out.println("2. Display Courses");
            System.out.println("3. Search Course");
            System.out.println("4. Update Course");
            System.out.println("5. Delete Course");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Course ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Course Name: ");
                    String name = sc.nextLine();

                    System.out.print("Lecturer: ");
                    String lecturer = sc.nextLine();

                    System.out.print("Credits: ");
                    int credits = sc.nextInt();

                    courses.add(new Course(id, name, lecturer, credits));
                    System.out.println("Course Added Successfully.");
                    break;

                case 2:

                    if (courses.isEmpty()) {
                        System.out.println("No Courses Available.");
                    } else {
                        for (Course c : courses) {
                            c.display();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Course ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Course c : courses) {
                        if (c.getCourseId() == searchId) {
                            c.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Course Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Course ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    found = false;

                    for (Course c : courses) {

                        if (c.getCourseId() == updateId) {

                            System.out.print("New Course Name: ");
                            c.setCourseName(sc.nextLine());

                            System.out.print("New Lecturer: ");
                            c.setLecturer(sc.nextLine());

                            System.out.print("New Credits: ");
                            c.setCredits(sc.nextInt());

                            found = true;

                            System.out.println("Course Updated Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Course Not Found.");

                    break;

                case 5:

                    System.out.print("Enter Course ID to Delete: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < courses.size(); i++) {

                        if (courses.get(i).getCourseId() == deleteId) {

                            courses.remove(i);
                            found = true;

                            System.out.println("Course Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Course Not Found.");

                    break;

                case 6:

                    System.out.println("Exiting Program...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}