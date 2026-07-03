import java.io.File;

public class ex7 {
    public static void main(String[] args) {
        File file = new File("student.txt");

        if(file.exists()) {
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
        }
    }
}