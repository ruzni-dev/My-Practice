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

// worker thread that uses the shared manager
class Worker extends Thread {
    private ThreadManager manager; // shared manager instance

    public Worker(ThreadManager manager, String name) {
        super(name);
        this.manager = manager;
    }

    public void run() {
        manager.printDetails(getName()); // delegate work to manager
    }
}

public class task01 {
    public static void main(String[] args) throws InterruptedException {

        ThreadManager manager = new ThreadManager(); // shared manager for all threads

        Worker t1 = new Worker(manager, "Thread 1");
        Worker t2 = new Worker(manager, "Thread 2");
        Worker t3 = new Worker(manager, "Thread 3");

        t1.start(); // start thread 1
        t2.start(); // start thread 2
        t3.start(); // start thread 3

        System.out.println("Thread 1 alive? " + t1.isAlive()); // check thread 1 status

        t1.join(); // wait for thread 1 to finish
        t2.join(); // wait for thread 2 to finish
        t3.join(); // wait for thread 3 to finish

        System.out.println("All threads completed.");
    }
}