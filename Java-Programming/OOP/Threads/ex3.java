//Using Runnable Interface
// Runnable interface is implemented by a class to create a thread.

class MyThread implements Runnable {
    public void run() {
        System.out.println("Runnable thread running...");
    }
}

public class ex3 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}