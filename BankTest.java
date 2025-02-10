abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * (interestRate / 100);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return 0;
    }
}

interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}

class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("001", "Alice", 10000, 5);
        BankAccount acc2 = new CurrentAccount("002", "Bob", 5000);
        acc1.displayDetails();
        acc2.displayDetails();
        System.out.println("Interest: " + acc1.calculateInterest());
        System.out.println("Interest: " + acc2.calculateInterest());
    }
}
