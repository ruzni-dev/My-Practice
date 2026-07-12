public class ex1 {
    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        }
        catch(Exception e) {
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("Always runs");
        }
        
    }
}