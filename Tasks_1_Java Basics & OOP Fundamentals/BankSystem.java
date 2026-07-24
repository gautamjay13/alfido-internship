// Base class
abstract class BankAccount {

    // Encapsulation
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Protected method for subclasses
    protected void deduct(double amount) {
        balance -= amount;
    }

    // Polymorphism (abstract method)
    public abstract void withdraw(double amount);
}


// Savings Account
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            deduct(amount);
            System.out.println("Withdrawal successful from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}


// Current Account
class CurrentAccount extends BankAccount {

    private double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            deduct(amount);
            System.out.println("Withdrawal successful from Current Account");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}


// Main class
public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", 10000);
        BankAccount acc2 = new CurrentAccount("CA201", 2000);

        acc1.withdraw(3000);   // polymorphism
        acc2.withdraw(6000);   // polymorphism

        acc1.deposit(2000);

        System.out.println("Savings Balance: " + acc1.getBalance());
        System.out.println("Current Balance: " + acc2.getBalance());
    }
}