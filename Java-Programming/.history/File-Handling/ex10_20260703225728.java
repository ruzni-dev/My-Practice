import java.io.*;

public class ex10 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            int data;
            data = fis.read();
            System.out.print(data);

            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}