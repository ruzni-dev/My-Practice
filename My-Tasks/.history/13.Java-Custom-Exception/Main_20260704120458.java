// Create a custom exception named InsufficientBalanceException.

import java.util.Scanner; // Import the Scanner class for user input.

// 1. Custom Exception Class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// 2. Bank Account Class
class BankAccount {
    private String accountNumber; // Account number
    private String accountHolderName; // Account holder name
    private double balance; // Current balance

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // 3. Withdraw Method
    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Withdrawal failed."); // Throw the custom exception if the withdrawal amount exceeds the balance.
        }

        balance -= amount; // Deduct the withdrawal amount from the balance.

        System.out.println("Withdrawal successful."); // Display a success message.
        System.out.println("Remaining Balance: " + balance); // Display the remaining balance after withdrawal.
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber); // Display the account number
        System.out.println("Account Holder Name: " + accountHolderName); // Display the account holder name
        System.out.println("Current Balance: " + balance); // Display the current balance
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input.

        // Create a BankAccount object.
        BankAccount account = new BankAccount("ACC1001", "Mohamad Ruzni", 5000); // Initialize account details.

        account.displayAccountDetails(); // Display the account details before withdrawal.

        // 4. Exception Handling, Handle exceptions using a try-catch block.
        try {
            System.out.print("\nEnter withdrawal amount: ");
            double amount = input.nextDouble(); // Accept a withdrawal amount from the user.

            account.withdraw(amount); // 5. Successful Withdrawal, Call the withdraw() method. Display the final result.

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage()); // Display the error message if the custom exception is thrown.
        } catch (Exception e) {
            System.out.println("Invalid input!"); // Handle any other exceptions that may occur during input or processing.
        }

        System.out.println("\nProgram completed successfully."); // Indicate that the program has completed execution.
        input.close(); // Close the Scanner object to free up resources.
    }
}