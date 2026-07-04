class NumberPrinter {

    // synchronize printing so each line is printed without mixing
    public void printNumber(int num) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + ": " + num);
        }
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