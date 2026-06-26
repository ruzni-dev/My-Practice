// Main class to test BankAccount encapsulation

public class Main {
    public static void main(String[] args) {

        // Create BankAccount object
        BankAccount account = new BankAccount();

        // Set account details using setters
        account.setAccountNumber("BA1001");
        account.setAccountHolderName("Mohamad Ruzni");
        account.setBalance(0);

        // Deposit ₹5000
        account.deposit(5000);

        // Withdraw ₹2000
        account.withdraw(2000);

        // Display updated account details
        account.displayAccountDetails();
    }
}