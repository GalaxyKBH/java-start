package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar;
        dollar = 5;
        if (dollar < 0) {
            System.out.println("dollar: " + dollar);
            System.out.println("출력: 잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("dollar: " + dollar);
            System.out.println("출력: 환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("dollar: " + dollar);
            System.out.println("출력: 환전 금액은 " + won + "원입니다.");
        }
    }
}
