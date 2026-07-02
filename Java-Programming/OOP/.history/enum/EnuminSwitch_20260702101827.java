enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnuminSwitch {
    public static void main(String[] args) {
        Day today = Day.TUESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of week");
                break;

            case TUESDAY:
                System.out.println("Second day");
                break;

            case WEDNESDAY:
                System.out.println("Mid week");
                break;
            case THURSDAY:
                System.out.println("Almost Friday");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Enjoy your weekend!");
                break;
            case SUNDAY:
                System.out.println("Rest and recharge!");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}