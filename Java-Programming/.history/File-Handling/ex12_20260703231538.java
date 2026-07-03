import java.io.*;

public class ex12 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                new FileOutputStream("data.txt", true);

            String text = "Hello Java";

            fos.write(System.lineSeparator().getBytes());
            fos.write(text.getBytes());
            fos.write(System.lineSeparator().getBytes());

            // Write multiple ASCII characters at once:
            // 65 = 'A', 66 = 'B', 67 = 'C', 68 = 'D'
            byte[] asciiChars = {65, 66, 67, 68};
            fos.write(asciiChars);

            fos.close();

            System.out.println("Data written to file successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}