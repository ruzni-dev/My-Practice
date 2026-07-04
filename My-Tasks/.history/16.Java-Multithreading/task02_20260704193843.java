class NumberPrinter {

    // print a number from a thread without mixing output
    public synchronized void printNumber(int num) {
        System.out.println(Thread.currentThread().getName() + ": " + num);
    }
}

// thread that prints odd numbers
class OddThread extends Thread {
    private NumberPrinter printer;

    public OddThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            printer.printNumber(i);
            try {
                Thread.sleep(500); // pause between prints
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
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        OddThread odd = new OddThread(printer);
        EvenThread even = new EvenThread(printer);

        odd.setName("Odd Thread");
        even.setName("Even Thread");

        odd.start();
        even.start();
    }
}