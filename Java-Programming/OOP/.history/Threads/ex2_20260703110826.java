// Thread with Loop
// A simple example of creating a thread by extending the Thread class

class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

public class ex2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}