class Runnable {
    void run() {
        System.out.println("Runnable running...");
    }
}

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
