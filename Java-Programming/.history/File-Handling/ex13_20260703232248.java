import java.io.*;

public class ex13 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                new BufferedReader(new FileReader("data.txt"));
            System.out.println(br.ready());

            int ch;

            while ((ch = br.read()) != -1) {
                System.out.print((char) ch);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}