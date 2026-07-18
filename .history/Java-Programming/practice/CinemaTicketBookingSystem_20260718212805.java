import java.util.Scanner;

public class CinemaTicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int ROWS = 5;
        final int COLS = 5;
        final double TICKET_PRICE = 1000.0;

        boolean[][] seats = new boolean[ROWS][COLS];

        while (true) {

            System.out.println("\n===== Cinema Ticket Booking System =====");
            System.out.println("1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Booked Seats");
            System.out.println("5. Calculate Ticket Price");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\nSeat Layout");
                    System.out.println("O = Available | X = Booked\n");

                    for (int i = 0; i < ROWS; i++) {
                        for (int j = 0; j < COLS; j++) {

                            if (seats[i][j])
                                System.out.print(" X ");
                            else
                                System.out.print(" O ");
                        }
                        System.out.println();
                    }

                    break;

                case 2:

                    System.out.print("Enter Row (1-5): ");
                    int row = sc.nextInt() - 1;

                    System.out.print("Enter Column (1-5): ");
                    int col = sc.nextInt() - 1;

                    if (row >= 0 && row < ROWS && col >= 0 && col < COLS) {

                        if (!seats[row][col]) {

                            seats[row][col] = true;
                            System.out.println("Seat Booked Successfully.");

                        } else {

                            System.out.println("Seat Already Booked.");
                        }

                    } else {

                        System.out.println("Invalid Seat Number.");
                    }

                    break;

                case 3:

                    System.out.print("Enter Row (1-5): ");
                    row = sc.nextInt() - 1;

                    System.out.print("Enter Column (1-5): ");
                    col = sc.nextInt() - 1;

                    if (row >= 0 && row < ROWS && col >= 0 && col < COLS) {

                        if (seats[row][col]) {

                            seats[row][col] = false;
                            System.out.println("Booking Cancelled.");

                        } else {

                            System.out.println("Seat is Already Available.");
                        }

                    } else {

                        System.out.println("Invalid Seat Number.");
                    }

                    break;

                case 4:

                    System.out.println("\nBooked Seats");

                    boolean found = false;

                    for (int i = 0; i < ROWS; i++) {

                        for (int j = 0; j < COLS; j++) {

                            if (seats[i][j]) {

                                System.out.println("Row " + (i + 1) +
                                                   " Seat " + (j + 1));

                                found = true;
                            }
                        }
                    }

                    if (!found)
                        System.out.println("No Seats Booked.");

                    break;

                case 5:

                    int booked = 0;

                    for (int i = 0; i < ROWS; i++) {

                        for (int j = 0; j < COLS; j++) {

                            if (seats[i][j])
                                booked++;
                        }
                    }

                    System.out.println("Booked Tickets : " + booked);
                    System.out.println("Ticket Price   : Rs. " + TICKET_PRICE);
                    System.out.println("Total Amount   : Rs. " +
                            (booked * TICKET_PRICE));

                    break;

                case 6:

                    System.out.println("Thank You.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}