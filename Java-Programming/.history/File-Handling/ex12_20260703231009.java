import java.io.*;

public class ex12 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                new FileOutputStream("data.txt", true);

            String text = "Hello Java";

            fos.write(text.getBytes());
            fos.write(System.lineSeparator().getBytes());
            fos.write(65); // writes character 'A'

            fos.close();

            System.out.println("Data written to file successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}