import models.BankAccount;
public class Main {
    public static void main(String[] args) {
        BankAccount.setBankName("Bank Of Paperopoli");

        BankAccount account1 = new BankAccount("123456789", 1000.0);
        BankAccount account2 = new BankAccount("987654321", 2000.0);

        account1.printAccountDetails();
        account2.printAccountDetails();

        account1.deposit(500.0);
        account2.deposit(1000.0);

        account1.withdraw(200.0);
        account2.withdraw(500.0);

        account1.printAccountDetails();
        account2.printAccountDetails();
    }

}
