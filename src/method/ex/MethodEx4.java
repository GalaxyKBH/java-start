package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0, amount;

        while (true) {
            System.out.print("----------------------------------\n1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n----------------------------------\n선택: ");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 옵션을 입력해주세요. :)");


            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려했으나 잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
        return balance;
    }

}
