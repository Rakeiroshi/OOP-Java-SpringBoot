package models;
public class BankAccount {
    static String bankName;
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositato: €" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Prelevato €" + amount);
        } else {
            System.out.println("Saldo insufficiente. Non è possibile prelevare €" + amount);
        }
    }

    public void printAccountDetails() {
        System.out.println("Nome Banca: " + bankName);
        System.out.println("Account: " + accountNumber);
        System.out.println("Saldo: €" + balance);
    }

}
