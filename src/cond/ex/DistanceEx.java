package cond.ex;

public class DistanceEx {

    public static void main(String[] args) {
        int distance;
        distance = 1000;

        if(distance <= 1){
            System.out.println("distance: " + distance);
            System.out.println("출력: 도보를 이용하세요.");
        } else if(distance <= 10){
            System.out.println("distance: " + distance);
            System.out.println("출력: 자전거를 이용하세요.");
        } else if(distance <= 100){
            System.out.println("distance: " + distance);
            System.out.println("출력: 자동차를 이용하세요.");
        } else {
            System.out.println("distance: " + distance);
            System.out.println("출력: 비행기를 이용하세요.");
        }
    }
}
