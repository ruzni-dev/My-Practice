import java.io.*;

public class ex11 {
    public static void main(String[] args) {
        try (FileInputStream input =
                 new FileInputStream("image.jpg");
             FileOutputStream output =
                 new FileOutputStream("copy.jpg")) {

            int i;

            while ((i = input.read()) != -1) {
                output.write(i);
            }

            System.out.println("File copied successfully.");

        } catch (Exception e) {
            System.out.println("Error handling file.");
        }
    }
}