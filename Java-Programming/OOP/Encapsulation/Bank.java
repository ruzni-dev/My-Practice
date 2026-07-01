// This is a simple Java program that demonstrates encapsulation. The `BankAccount` class has a private attribute `balance`, and public methods to deposit money and retrieve the balance. In the `main` method, we create an instance of the `BankAccount` class, deposit an amount, and then print the balance.

class BankAccount {
    private double balance; // Private attribute, cannot be accessed directly from outside the class

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Public method to retrieve the current balance
    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // Create an instance of the `BankAccount` class

        account.deposit(5000); // Deposit an amount into the account

        System.out.println(account.getBalance()); // Print the current balance of the account
    }
}
