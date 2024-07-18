package level2.access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.getBalance();
        account.withdraw(3000);
        account.deposit(-1000);
        account.withdraw(300000);
    }
}
