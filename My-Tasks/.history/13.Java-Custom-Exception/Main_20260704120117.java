// Create a custom exception named InsufficientBalanceException.
// 

import java.util.Scanner;

// 1. Custom Exception Class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// 2. Bank Account Class
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // 3. Withdraw Method
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Withdrawal failed.");
        }

        balance -= amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: " + balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create a BankAccount object.
        BankAccount account = new BankAccount("ACC1001", "Mohamad Ruzni", 5000); // Initialize account details.

        account.displayAccountDetails();

        // 4. Exception Handling
        try {
            System.out.print("\nEnter withdrawal amount: ");
            double amount = input.nextDouble(); // Accept a withdrawal amount from the user.

            account.withdraw(amount); // 5. Successful Withdrawal

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        System.out.println("\nProgram completed successfully.");
        input.close();
    }
}