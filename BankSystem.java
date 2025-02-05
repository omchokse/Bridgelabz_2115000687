import java.util.ArrayList;

class Bank {
    String name;
    ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void showCustomers() {
        System.out.println("Bank: " + name);
        for (Customer c : customers) {
            System.out.println("Customer: " + c.name);
        }
    }
}

class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer cust1 = new Customer("Alice", 5000);
        Customer cust2 = new Customer("Bob", 3000);

        bank.addCustomer(cust1);
        bank.addCustomer(cust2);

        bank.showCustomers();
        cust1.viewBalance();
        cust2.viewBalance();
    }
}