// Main class to test inheritance

public class Main {
    public static void main(String[] args) {

        // Full-time employee object
        FullTimeEmployee emp1 =
                new FullTimeEmployee("Alice Johnson", 101, 50000);

        // Part-time employee object
        PartTimeEmployee emp2 =
                new PartTimeEmployee("Mohamad Ruzni", 102, 80, 250);

        // Display details
        emp1.displayFullTimeDetails();
        emp2.displayPartTimeDetails();
    }
}