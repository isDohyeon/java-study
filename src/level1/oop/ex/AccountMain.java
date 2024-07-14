package level1.oop.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withDraw(9000);
        account.withDraw(2000);
    }
}
