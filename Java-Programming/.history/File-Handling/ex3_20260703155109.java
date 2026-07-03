import java.io.FileWriter;
import java.io.IOException;

public class ex3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Name: Ruzni\n");
            writer.write("Age: 22");

            writer.close();

            System.out.println("Written successfully");

        } catch(IOException e) {
            System.out.println("Error");
        }
    }
}