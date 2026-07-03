import java.io.File;

public class ex8 {
    public static void main(String[] args) {
        File file = new File("data.txt");

        if(file.delete()) {
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Delete failed");
        }
    }
}