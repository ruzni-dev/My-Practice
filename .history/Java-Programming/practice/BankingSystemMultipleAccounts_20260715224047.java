import java.util.ArrayList;
import java.util.Scanner;

class Account {

    private int accountNumber;
    private String holderName;
    private double balance;


    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful.");
    }


    public void withdraw(double amount) {

        try {

            if (amount > balance) {
                throw new Exception("Insufficient Balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal Successful.");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }


    public void display() {

        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }
}


public class BankingSystemMultipleAccounts {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<Account> accounts = new ArrayList<>();


        while(true) {


            System.out.println("\n===== Banking System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Search Account");
            System.out.println("5. Display All");
            System.out.println("6. Exit");


            System.out.print("Choice: ");

            int choice = sc.nextInt();



            switch(choice) {


                case 1:

                    System.out.print("Account Number: ");
                    int no = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Holder Name: ");
                    String name = sc.nextLine();


                    System.out.print("Initial Balance: ");
                    double balance = sc.nextDouble();


                    accounts.add(new Account(no,name,balance));

                    System.out.println("Account Created.");

                    break;



                case 2:

                    System.out.print("Account Number: ");
                    int dep = sc.nextInt();

                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();


                    for(Account a : accounts) {

                        if(a.getAccountNumber()==dep) {

                            a.deposit(amount);
                        }
                    }

                    break;



                case 3:

                    System.out.print("Account Number: ");
                    int with = sc.nextInt();


                    System.out.print("Amount: ");
                    double withdraw = sc.nextDouble();


                    for(Account a : accounts) {

                        if(a.getAccountNumber()==with) {

                            a.withdraw(withdraw);
                        }
                    }

                    break;



                case 4:

                    System.out.print("Account Number: ");
                    int search = sc.nextInt();


                    for(Account a : accounts) {

                        if(a.getAccountNumber()==search) {

                            a.display();
                        }
                    }

                    break;



                case 5:

                    for(Account a : accounts) {

                        a.display();
                    }

                    break;



                case 6:

                    sc.close();
                    return;



                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}