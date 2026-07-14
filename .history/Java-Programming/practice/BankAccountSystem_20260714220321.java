import java.util.Scanner;

class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient Balance!");
            }

            balance -= amount;
            System.out.println("Withdrawn: " + amount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void display() {
        System.out.println("\nAccount Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

public class BankAccountSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.display();
                    break;

                case 4:
                    System.out.println("Thank You.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}