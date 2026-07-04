class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() +
                " trying to withdraw: " + amount);

        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " withdrew: " + amount);
        } else {
            System.out.println("Withdrawal failed! Insufficient balance.");
        }

        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccount {
    
}
