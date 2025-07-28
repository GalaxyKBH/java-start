package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 3, sum = 0, i = 0;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
