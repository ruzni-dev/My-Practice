// join()
// The join() method is used to pause the execution of the current thread until the thread on which join() was called has completed its execution. In other words, it allows one thread to wait for another thread to finish before proceeding with its own execution.

class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();

        t.start();
        t.join();

        System.out.println("Main thread finished");
    }
}