import java.io.*;

public class ex12 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                new FileOutputStream("data.txt");

            String text = "Hello Java";

            fos.write(text.getBytes());

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}