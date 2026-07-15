import java.util.ArrayList;
import java.util.Scanner;

class Patient {

    int id;
    String name;
    int age;
    String disease;
    String doctor;

    public Patient(int id, String name, int age, String disease, String doctor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.doctor = doctor;
    }

    public void display() {

        System.out.println("\nPatient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor: " + doctor);
        System.out.println("-------------------------");
    }
}


public class HospitalManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();


            switch (choice) {


                case 1:

                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Disease: ");
                    String disease = sc.nextLine();

                    System.out.print("Doctor Name: ");
                    String doctor = sc.nextLine();


                    patients.add(new Patient(id, name, age, disease, doctor));

                    System.out.println("Patient Registered Successfully.");

                    break;



                case 2:

                    if (patients.isEmpty()) {

                        System.out.println("No Patient Records.");

                    } else {

                        for (Patient p : patients) {
                            p.display();
                        }
                    }

                    break;



                case 3:

                    System.out.print("Enter Patient ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;


                    for (Patient p : patients) {

                        if (p.id == searchId) {

                            p.display();
                            found = true;
                            break;
                        }
                    }


                    if (!found)
                        System.out.println("Patient Not Found.");

                    break;



                case 4:

                    System.out.print("Enter Patient ID: ");
                    int deleteId = sc.nextInt();

                    found = false;


                    for (int i = 0; i < patients.size(); i++) {


                        if (patients.get(i).id == deleteId) {

                            patients.remove(i);

                            found = true;

                            System.out.println("Patient Deleted.");

                            break;
                        }
                    }


                    if (!found)
                        System.out.println("Patient Not Found.");

                    break;



                case 5:

                    System.out.println("System Closed.");
                    sc.close();
                    return;



                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}