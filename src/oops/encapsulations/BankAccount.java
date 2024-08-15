package oops.encapsulations;

public class BankAccount {
    private double balance; // private variable

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() { // public getter method
        return balance;
    }

    public void deposit(double amount) { // public method to modify balance
        balance += amount;
    }

    public void withdraw(double amount) { // public method to modify balance
        balance -= amount;
    }

}
