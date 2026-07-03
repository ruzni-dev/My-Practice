import java.io.*;

public class ex10 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            int data;

            System.out.println("Bytes available before reading: " + fis.available());

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}