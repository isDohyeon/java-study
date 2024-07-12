package basic.oop.ex;

public class Account {

    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withDraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔액 : " + balance);
        } else {
            balance -= amount;
        }
    }
}
