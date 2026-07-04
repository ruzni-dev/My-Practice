class NumberPrinter {
    public synchronized void printNumber(int num) {
        System.out.println(Thread.currentThread().getName() + ": " + num);
    }
}

class OddThread extends Thread {
    private NumberPrinter printer;

    public OddThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            printer.printNumber(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

class EvenThread extends Thread {
    private NumberPrinter printer;

    public EvenThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            printer.printNumber(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

public class task02 {
    public static void main(String[] args) throws InterruptedException {
        NumberPrinter printer = new NumberPrinter();

        OddThread odd = new OddThread(printer);
        EvenThread even = new EvenThread(printer);

        odd.setName("Odd Thread");
        even.setName("Even Thread");

        // ensure all odd numbers print before even numbers
        odd.start();
        odd.join();

        even.start();
        even.join();
    }
}