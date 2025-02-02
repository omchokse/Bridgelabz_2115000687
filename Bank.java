class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 5000.0);
        System.out.println("Initial Balance: " + account.getBalance());
        account.setBalance(6000.0);
        System.out.println("Updated Balance: " + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Smith", 10000.0, 4.5);
        savingsAccount.displayDetails();
    }
}
