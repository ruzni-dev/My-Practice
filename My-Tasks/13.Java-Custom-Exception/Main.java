import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create BankAccount object
        BankAccount account = new BankAccount("ACC1001", "Mohamad Ruzni", 5000);

        account.displayAccountDetails();

        try {
            System.out.print("\nEnter withdrawal amount: ");
            double amount = input.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        System.out.println("\nProgram completed successfully.");
        input.close();
    }
}