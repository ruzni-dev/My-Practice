// Anonymous class example

public class RealLife {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Thread running...");
            }
        };

        r.run();
    }
}
