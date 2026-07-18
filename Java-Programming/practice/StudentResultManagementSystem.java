import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private int[] marks = new int[5];

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }

    public int getId() {
        return id;
    }

    public int getTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    public double getAverage() {
        return getTotal() / 5.0;
    }

    public String getGrade() {

        double avg = getAverage();

        if (avg >= 75)
            return "A";
        else if (avg >= 65)
            return "B";
        else if (avg >= 55)
            return "C";
        else if (avg >= 35)
            return "S";
        else
            return "F";
    }

    public void display() {

        System.out.println("\n==============================");
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("Total      : " + getTotal());
        System.out.printf("Average    : %.2f%n", getAverage());
        System.out.println("Grade      : " + getGrade());
    }
}

public class StudentResultManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Result Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Display Top Scorer");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Student Name: ");
                    String name = sc.nextLine();

                    int[] marks = new int[5];

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Subject " + (i + 1) + " Marks: ");
                        marks[i] = sc.nextInt();
                    }

                    students.add(new Student(id, name, marks));
                    System.out.println("Student Added Successfully.");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Student Records.");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.getId() == searchId) {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 4:

                    if (students.isEmpty()) {

                        System.out.println("No Student Records.");
                        break;
                    }

                    Student topStudent = students.get(0);

                    for (Student s : students) {

                        if (s.getTotal() > topStudent.getTotal()) {
                            topStudent = s;
                        }
                    }

                    System.out.println("\n===== Top Scorer =====");
                    topStudent.display();

                    break;

                case 5:

                    System.out.println("Program Closed.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}