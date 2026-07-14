import java.io.*;
import java.util.Scanner;

public class FileHandlingApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fileName = "data.txt";

        while (true) {

            System.out.println("\n===== File Handling =====");
            System.out.println("1. Create File");
            System.out.println("2. Write to File");
            System.out.println("3. Read File");
            System.out.println("4. Append to File");
            System.out.println("5. Delete File");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {

                switch (choice) {

                    case 1:
                        File file = new File(fileName);

                        if (file.createNewFile())
                            System.out.println("File Created Successfully.");
                        else
                            System.out.println("File Already Exists.");
                        break;

                    case 2:
                        FileWriter writer = new FileWriter(fileName);
                        System.out.print("Enter Text: ");
                        writer.write(sc.nextLine());
                        writer.close();
                        System.out.println("Data Written Successfully.");
                        break;

                    case 3:
                        BufferedReader reader = new BufferedReader(new FileReader(fileName));
                        String line;

                        System.out.println("\nFile Content:");

                        while ((line = reader.readLine()) != null)
                            System.out.println(line);

                        reader.close();
                        break;

                    case 4:
                        FileWriter append = new FileWriter(fileName, true);
                        System.out.print("Enter Text to Append: ");
                        append.write("\n" + sc.nextLine());
                        append.close();
                        System.out.println("Data Appended.");
                        break;

                    case 5:
                        File delete = new File(fileName);

                        if (delete.delete())
                            System.out.println("File Deleted.");
                        else
                            System.out.println("Unable to Delete File.");

                        break;

                    case 6:
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice.");
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}