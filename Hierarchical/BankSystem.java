package Hierarchical;

// Superclass
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass 3
class FixedDepositAccount extends BankAccount {
    int lockPeriod; // in months

    FixedDepositAccount(String accountNumber, double balance, int lockPeriod) {
        super(accountNumber, balance);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Lock Period: " + lockPeriod + " months");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 10000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 5000, 2000);
        FixedDepositAccount fda = new FixedDepositAccount("FDA789", 50000, 12);

        sa.displayDetails();
        sa.displayAccountType();
        System.out.println();

        ca.displayDetails();
        ca.displayAccountType();
        System.out.println();

        fda.displayDetails();
        fda.displayAccountType();
    }
}
