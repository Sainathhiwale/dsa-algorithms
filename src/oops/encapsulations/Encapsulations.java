package oops.encapsulations;

public class Encapsulations {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        System.out.println(bankAccount.getBalance());
        System.out.println("after deposit more money");
        bankAccount.deposit(2000);
        System.out.println(bankAccount.getBalance());
        System.out.println("after withdraw the money get balance amount:");
        bankAccount.withdraw(5000);
        System.out.println(bankAccount.getBalance());

    }
}
