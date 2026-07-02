enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class ex1 {
    public static void main(String[] args) {
        Days[] allDays = Days.values();

        System.out.println("All days:");
        for (Days day : allDays) {
            System.out.println(day);
        }

        Days day = Days.valueOf("FRIDAY");
        System.out.println("\nSelected day: " + day);

        System.out.println("\nOrdinal of " + day + " is " + day.ordinal());
    }
}
