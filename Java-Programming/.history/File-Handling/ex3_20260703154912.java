import java.io.File;

public class ex3 {
    public static void main(String[] args) {
        File file = new File("data.txt");

        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Error occurred while creating the file.");
        }
    }
}
