package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("출력");
        int i = 0;
        for (int num : nums) {
            System.out.print(num);
            i++;
            if (i < nums.length) {
                System.out.print(", ");
            }
        }
    }
}
