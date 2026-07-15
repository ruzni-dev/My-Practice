import java.util.Scanner;

class Room {

    int roomNumber;
    boolean booked;
    String customerName;


    public Room(int roomNumber) {

        this.roomNumber = roomNumber;
        this.booked = false;
        this.customerName = "";
    }


    public void display() {

        System.out.println(
            "Room No: " + roomNumber +
            " | Status: " +
            (booked ? "Booked by " + customerName : "Available")
        );
    }
}


public class HotelBookingSystem {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Room[] rooms = new Room[10];


        for (int i = 0; i < rooms.length; i++) {

            rooms[i] = new Room(i + 1);
        }



        while (true) {


            System.out.println("\n===== Hotel Booking System =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Booked Rooms");
            System.out.println("5. Exit");


            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();



            switch (choice) {



                case 1:


                    System.out.println("\nRoom Details:");

                    for (Room r : rooms) {

                        r.display();
                    }

                    break;




                case 2:


                    System.out.print("Enter Room Number: ");

                    int bookRoom = sc.nextInt();

                    sc.nextLine();


                    if (bookRoom < 1 || bookRoom > 10) {

                        System.out.println("Invalid Room Number.");

                        break;
                    }


                    Room room = rooms[bookRoom - 1];


                    if (room.booked) {


                        System.out.println("Room Already Booked.");


                    } else {


                        System.out.print("Customer Name: ");

                        room.customerName = sc.nextLine();

                        room.booked = true;


                        System.out.println("Room Booked Successfully.");

                    }


                    break;





                case 3:


                    System.out.print("Enter Room Number: ");

                    int cancelRoom = sc.nextInt();



                    if (cancelRoom < 1 || cancelRoom > 10) {


                        System.out.println("Invalid Room Number.");

                        break;

                    }



                    room = rooms[cancelRoom - 1];



                    if (room.booked) {


                        room.booked = false;

                        room.customerName = "";


                        System.out.println("Booking Cancelled.");



                    } else {


                        System.out.println("Room is not booked.");

                    }



                    break;





                case 4:


                    System.out.println("\nBooked Rooms:");


                    boolean found = false;


                    for (Room r : rooms) {


                        if (r.booked) {


                            r.display();

                            found = true;

                        }
                    }


                    if (!found)

                        System.out.println("No Booked Rooms.");



                    break;





                case 5:


                    System.out.println("Thank You.");

                    sc.close();

                    return;





                default:


                    System.out.println("Invalid Choice.");

            }
        }
    }
}