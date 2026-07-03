import java.io.File;
import java.io.IOException;

public class ex2 {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");

            file.createNewFile();

        } catch(IOException e) {
            System.out.println("Error occurred");
        }
    }
}