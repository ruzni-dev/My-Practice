import java.io.FileWriter;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("record.txt");

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age);

            writer.close();

            System.out.println("Saved successfully");

        } catch(Exception e) {
            System.out.println("Error");
        }
    }
}