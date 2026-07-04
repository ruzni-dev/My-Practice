// Java Multithreading – Bank Account Synchronization

// This program demonstrates the use of multithreading in Java to simulate a bank account with synchronized deposit and withdrawal operations. The BankAccount class represents a bank account with methods for depositing and withdrawing money. The DepositThread and WithdrawThread classes extend the Thread class and represent threads that perform deposit and withdrawal operations, respectively. The main method creates a shared BankAccount object and starts multiple threads to perform concurrent deposit and withdrawal operations, ensuring thread safety through synchronization.
class BankAccount {

    private double balance; // Represents the current balance of the bank account

    // Constructor to initialize the BankAccount object with an initial balance
    public BankAccount(double balance) {
        this.balance = balance; // Assign the initial balance to the balance variable
    }

    // Synchronized method to deposit money into the bank account. It ensures that only one thread can execute this method at a time, preventing race conditions.
    public synchronized void deposit(double amount) {
        balance += amount; // Update the balance by adding the deposited amount
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount); // Print the name of the thread that performed the deposit and the amount deposited
        System.out.println("Current Balance: " + balance); // Print the current balance after the deposit operation
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw: " + amount); // Print the name of the thread that is trying to withdraw and the amount to be withdrawn

        // Check if the withdrawal amount is less than or equal to the current balance. If it is, perform the withdrawal; otherwise, print an error message indicating insufficient balance.
        if (amount <= balance) {
            balance -= amount; // Update the balance by subtracting the withdrawn amount
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount); // Print the name of the thread that performed the withdrawal and the amount withdrawn
        } else {
            System.out.println("Withdrawal failed! Insufficient balance."); // Print an error message indicating that the withdrawal failed due to insufficient balance
        }

        System.out.println("Current Balance: " + balance); // Print the current balance after the withdrawal operation
    }
}

// The DepositThread class extends the Thread class and represents a thread that performs a deposit operation on a shared BankAccount object. It takes a reference to the BankAccount and the amount to be deposited as parameters in its constructor.
class DepositThread extends Thread {

    private BankAccount account; // Reference to the shared BankAccount object
    private double amount; // Amount to be deposited into the bank account

    // Constructor to initialize the DepositThread object with a reference to the BankAccount and the amount to be deposited
    public DepositThread(BankAccount account, double amount) {
        this.account = account; // Assign the shared BankAccount object to the account variable
        this.amount = amount; // Assign the amount to be deposited to the amount variable
    }

    @Override // Override the run method to define the behavior of the thread when it starts. It calls the deposit method of the BankAccount object to perform the deposit operation.
    public void run() {
        account.deposit(amount); // Call the deposit method of the BankAccount object to perform the deposit operation
    }
}

// The WithdrawThread class extends the Thread class and represents a thread that performs a withdrawal operation on a shared BankAccount object. It takes a reference to the BankAccount and the amount to be withdrawn as parameters in its constructor.
class WithdrawThread extends Thread {

    private BankAccount account; // Reference to the shared BankAccount object
    private double amount; // Amount to be withdrawn from the bank account

    // Constructor to initialize the WithdrawThread object with a reference to the BankAccount and the amount to be withdrawn
    public WithdrawThread(BankAccount account, double amount) {
        this.account = account; // Assign the shared BankAccount object to the account variable
        this.amount = amount; // Assign the amount to be withdrawn to the amount variable
    }
 
    @Override // Override the run method to define the behavior of the thread when it starts. It calls the withdraw method of the BankAccount object to perform the withdrawal operation.
    public void run() {
        account.withdraw(amount); // Call the withdraw method of the BankAccount object to perform the withdrawal operation
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
