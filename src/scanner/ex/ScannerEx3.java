package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = sc.nextLine();

        System.out.print("음식 가격을 입력해주세요: ");
        int foodPrice = sc.nextInt();

        System.out.print("음식 수량을 입력해주세요: ");
        int foodQuantity = sc.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
    }
}
