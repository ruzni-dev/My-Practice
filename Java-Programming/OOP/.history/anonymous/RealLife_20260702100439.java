package anonymous;

public class RealLife {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Thread running...");
            }
        };

        task.run();
    }
}
