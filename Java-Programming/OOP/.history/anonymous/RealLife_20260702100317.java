package anonymous;

public class RealLife {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running...");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
