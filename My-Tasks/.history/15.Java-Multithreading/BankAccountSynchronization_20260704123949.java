// Bank account multithreading demo

class BankAccount {

    private double balance; // current balance

    // initialize account with given balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // deposit amount (thread-safe)
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // withdraw amount if available (thread-safe)
    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw: " + amount);
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
        } else {
            System.out.println("Withdrawal failed! Insufficient balance.");
        }
        System.out.println("Current Balance: " + balance);
    }
}

// Thread that performs a deposit
class DepositThread extends Thread {

    private BankAccount account; // shared account
    private double amount; // amount to deposit

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

// Thread that performs a withdrawal
class WithdrawThread extends Thread {

    private BankAccount account; // shared account
    private double amount; // amount to withdraw

    public WithdrawThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class BankAccountSynchronization {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        DepositThread deposit1 = new DepositThread(account, 500);
        WithdrawThread withdraw1 = new WithdrawThread(account, 700);
        WithdrawThread withdraw2 = new WithdrawThread(account, 1200);

        deposit1.setName("Deposit Thread");
        withdraw1.setName("Withdraw Thread 1");
        withdraw2.setName("Withdraw Thread 2");

        deposit1.start();
        withdraw1.start();
        withdraw2.start();
    }
}
