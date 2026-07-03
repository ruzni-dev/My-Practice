// Using sleep()
// The sleep() method is used to pause the execution of a thread for a specified amount of time.

class MyThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

public class ex5 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}