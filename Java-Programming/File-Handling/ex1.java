import java.io.File;

public class ex1 {
    public static void main(String[] args) {
        File file = new File("data.txt");

        System.out.println(file.exists());
    }
}