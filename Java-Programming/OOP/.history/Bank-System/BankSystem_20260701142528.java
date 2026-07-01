// The Account class demonstrates encapsulation by keeping fields private
// and exposing controlled access through public getter methods.
class Account {
    private String name;
    private double balance;

    // Constructor initializes account holder name and starting balance.
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Returns the account holder's name.
    public String getName() {
        return name;
    }

    // Returns the current account balance.
    public double getBalance() {
        return balance;
    }

    // Adds money to the account only if the deposit amount is positive.
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

// SavingsAccount inherits from Account and adds a method specific to savings accounts.
class SavingsAccount extends Account {

    // Call the parent Account constructor to initialize values.
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    // Prints the type of account to the console.
    void showType() {
        System.out.println("This is a Savings Account");
    }
}

// AccountType is a superclass for different account types demonstrating polymorphism.
class AccountType {
    // Default interest rate method for general account types.
    void interestRate() {
        System.out.println("General interest rate: 2%");
    }
}

// Savings overrides the interestRate method to show a savings-specific rate.
class Savings extends AccountType {
    @Override
    void interestRate() {
        System.out.println("Savings interest rate: 5%");
    }
}

// FixedDeposit overrides interestRate to show a fixed deposit-specific rate.
class FixedDeposit extends AccountType {
    @Override
    void interestRate() {
        System.out.println("Fixed Deposit interest rate: 8%");
    }
}

public class BankSystem {
    public static void main(String[] args) {

        // Encapsulation example: create an Account, deposit money, and access values safely.
        Account acc = new Account("Ruzni", 1000);
        acc.deposit(500);

        System.out.println("Name: " + acc.getName());
        System.out.println("Balance: " + acc.getBalance());

        System.out.println();

        // Inheritance example: SavingsAccount extends Account and reuses its behavior.
        SavingsAccount sa = new SavingsAccount("Ruzni", 2000);
        sa.showType();

        System.out.println();

        // Polymorphism example: we use the AccountType reference to call overridden methods.
        AccountType a;

        a = new Savings();
        a.interestRate();

        a = new FixedDeposit();
        a.interestRate();
    }
}
