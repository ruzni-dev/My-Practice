// Task 01 – Thread Execution Manager

// manages thread output in a synchronized way
class ThreadManager {

    // only one thread can run this method at a time
    public synchronized void printDetails(String threadName) {
        System.out.println(threadName + " is running...");
        try {
            Thread.sleep(1000); // pause for one second to simulate work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println(threadName + " finished.");
    }
}

class Worker extends Thread {
    private ThreadManager manager;

    public Worker(ThreadManager manager, String name) {
        super(name);
        this.manager = manager;
    }

    public void run() {
        manager.printDetails(getName());
    }
}

public class task01 {
    public static void main(String[] args) throws InterruptedException {

        ThreadManager manager = new ThreadManager();

        Worker t1 = new Worker(manager, "Thread 1");
        Worker t2 = new Worker(manager, "Thread 2");
        Worker t3 = new Worker(manager, "Thread 3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread 1 alive? " + t1.isAlive());

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads completed.");
    }
}