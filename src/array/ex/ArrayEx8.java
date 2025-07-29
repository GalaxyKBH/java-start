package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int students = sc.nextInt();
        int[][] scores = new int[students][3];
        int[] total = new int[students];
        double[] average = new double[students];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = sc.nextInt();
                total[i] += scores[i][j];
            }
            average[i] = (double) total[i] / subjects.length;
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + total[i] + ", 평균: " + average[i]);
        }
    }
}
