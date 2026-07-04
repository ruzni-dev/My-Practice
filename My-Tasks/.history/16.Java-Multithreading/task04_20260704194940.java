// Task 04 – Printer Service

class Printer {
    public synchronized void printDocument(String employeeName) {
        System.out.println(employeeName + " started printing...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        System.out.println(employeeName + " completed printing.");
    }
}

class Employee extends Thread {
    private Printer printer;

    public Employee(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    public void run() {
        printer.printDocument(getName());
    }
}

public class task04 {
    public static void main(String[] args) throws InterruptedException {

        Printer printer = new Printer();

        Employee e1 = new Employee(printer, "Employee 1");
        Employee e2 = new Employee(printer, "Employee 2");
        Employee e3 = new Employee(printer, "Manager");

        e3.setPriority(Thread.MAX_PRIORITY);

        e1.start();
        e2.start();
        e3.start();

        e1.join();
        e2.join();
        e3.join();

        System.out.println("All print jobs completed.");
    }
}