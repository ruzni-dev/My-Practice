// create a file named "student.txt" in the current directory
import java.io.File;

public class ex2 {
    public static void main(String[] args) {
        File file = new File("student.txt");
        file.createNewFile();
        
       
    }
}