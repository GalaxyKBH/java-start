package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 3;
        String result = (x % 2 == 0) ? "출력: x = " + x + ", 짝수" : "출력: x = " + x + ", 홀수";
        System.out.println(result);
    }
}
