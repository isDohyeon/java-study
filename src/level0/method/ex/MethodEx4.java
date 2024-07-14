package level0.method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 : ");
            int input = sc.nextInt();
            sc.nextLine();

            if (input == 1) {
                balance = deposit(balance, sc);
            } else if (input == 2) {
                balance = withdraw(balance, sc);
            } else if (input == 3) {
                System.out.println("현재 잔액 : " + balance + "원");
            } else if (input == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 번호를 입력해주세요.");
            }

        }
    }

    public static int deposit(int balance, Scanner sc) {
        System.out.print("입금액을 입력하세요 : ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔엑 : " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, Scanner sc) {
        System.out.println("출금액을 입력하세요 : ");
        int amount = sc.nextInt();

        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
