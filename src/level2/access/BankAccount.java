package level2.access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void getBalance() {
        System.out.println("잔액 : " + balance);
    }
}
