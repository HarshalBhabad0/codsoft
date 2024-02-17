import java.util.Scanner;

 
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited:Rs " + amount);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn:Rs " + amount);
            return true;
        } else {
            System.out.println("Insufficient Balance!");
            return false;
        }
    }
}


class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayOptions() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void executeOption(int option) {
        Scanner sc = new Scanner(System.in);
        double amount;

        switch (option) {
            case 1:
                System.out.print("Enter amount to withdraw:Rs ");
                amount = sc.nextDouble();
                bankAccount.withdraw(amount);
                break;
            case 2:
                System.out.print("Enter amount to deposit:Rs ");
                amount = sc.nextDouble();
                bankAccount.deposit(amount);
                break;
            case 3:
                System.out.println("Your balance:Rs " + bankAccount.getBalance());
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                System.exit(0);
            default:
                System.out.println("Invalid option!");
        }
    }
}

public class ATM_main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000.0); 
        ATM atm = new ATM(account);
        Scanner sc1 = new Scanner(System.in);

        while (true) {
            atm.displayOptions();
            System.out.print("Enter your choice: ");
            int option = sc1.nextInt();
            atm.executeOption(option);
        }
    }
}