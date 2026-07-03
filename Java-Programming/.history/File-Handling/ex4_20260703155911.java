// append the content of a file

import java.io.File;
import java.io.FileWriter;

public class ex4 {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            if(file.exists()) {
                System.out.println("File exists");
            } else {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write("\nMarks: 95");
            writer.close();
            System.out.println("Written successfully");
        } catch(Exception e) {
            System.out.println("Error occurred");
        }
    }
}
