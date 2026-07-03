// Anonymous Thread
// An anonymous thread is a thread that is created without a specific name or identifier. It is typically used for short-lived tasks or when the thread's identity is not important.

public class ex6 {
    public static void main(String[] args) {

        Thread t = new Thread() {
            public void run() {
                System.out.println("Anonymous thread running");
            }
        };

        t.start();
    }
}