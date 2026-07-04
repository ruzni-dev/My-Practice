class Report {

    public synchronized void writeResult(String studentName, int marks) {
        System.out.println(studentName + " scored: " + marks);
    }
}

class StudentThread extends Thread {
    private Report report;
    private String studentName;

    public StudentThread(Report report, String studentName) {
        this.report = report;
        this.studentName = studentName;
    }

    public void run() {
        int marks = (int)(Math.random() * 101);
        report.writeResult(studentName, marks);
    }
}

public class task03 {
    public static void main(String[] args) {

        Report report = new Report();

        StudentThread s1 = new StudentThread(report, "Alice");
        StudentThread s2 = new StudentThread(report, "Bob");
        StudentThread s3 = new StudentThread(report, "Charlie");

        s1.start();
        s2.start();
        s3.start();

        while (s1.isAlive() || s2.isAlive() || s3.isAlive()) {
            System.out.println("Students are being processed...");
        }

        System.out.println("All results generated.");
    }
}