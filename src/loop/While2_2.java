package loop;

public class While2_2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 2;
        int endNum = 5;
        while (i <= endNum) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
