class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
}

class FixedDepositAccount extends BankAccount {
    FixedDepositAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 5000, 3.5);
        CheckingAccount c = new CheckingAccount(102, 2000, 1000);
        System.out.println(s.accountNumber + " " + s.interestRate);
        System.out.println(c.accountNumber + " " + c.withdrawalLimit);
    }
}
