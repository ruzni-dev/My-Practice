// Bank account multithreading demo

class BankAccount {

    private double balance; // current account balance

    // initialize the account with a starting balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // deposit amount into the account safely
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // withdraw amount only if enough balance is present
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

// thread that performs a deposit operation
class DepositThread extends Thread {

    private BankAccount account; // shared bank account
    private double amount; // deposit amount

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

// thread that performs a withdrawal operation
class WithdrawThread extends Thread {

    private BankAccount account; // shared bank account
    private double amount; // withdrawal amount

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

        // create one shared bank account for all threads
        BankAccount account = new BankAccount(1000);

        // create deposit and withdrawal threads
        DepositThread deposit1 = new DepositThread(account, 500);
        WithdrawThread withdraw1 = new WithdrawThread(account, 700);
        WithdrawThread withdraw2 = new WithdrawThread(account, 1200);

        deposit1.setName("Deposit Thread");
        withdraw1.setName("Withdraw Thread 1");
        withdraw2.setName("Withdraw Thread 2");

        // start all threads
        deposit1.start();
        withdraw1.start();
        withdraw2.start();
    }
}
