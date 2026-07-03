import java.io.FileWriter;
import java.io.IOException;

public class ex9 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("data.txt")) {
            writer.write("Hello");
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}