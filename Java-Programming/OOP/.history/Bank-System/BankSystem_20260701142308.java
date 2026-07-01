class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    void showType() {
        System.out.println("This is a Savings Account");
    }
}

class AccountType {
    void interestRate() {
        System.out.println("General interest rate: 2%");
    }
}

class Savings extends AccountType {
    @Override
    void interestRate() {
        System.out.println("Savings interest rate: 5%");
    }
}

class FixedDeposit extends AccountType {
    @Override
    void interestRate() {
        System.out.println("Fixed Deposit interest rate: 8%");
    }
}

public class BankSystem {
    public static void main(String[] args) {

        // Encapsulation example
        Account acc = new Account("Ruzni", 1000);
        acc.deposit(500);

        System.out.println("Name: " + acc.getName());
        System.out.println("Balance: " + acc.getBalance());

        System.out.println();

        // Inheritance example
        SavingsAccount sa = new SavingsAccount("Ruzni", 2000);
        sa.showType();

        System.out.println();

        // Polymorphism example
        AccountType a;

        a = new Savings();
        a.interestRate();

        a = new FixedDeposit();
        a.interestRate();
    }
}
