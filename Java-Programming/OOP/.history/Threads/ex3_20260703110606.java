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