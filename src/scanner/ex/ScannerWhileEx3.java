package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        int sum = 0, count = 0, input;
        while (true) {
            input = sc.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }

        /*
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
        */


        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
