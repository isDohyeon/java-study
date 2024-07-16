package level2.math;

public class MathMain {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int x = -100;

        System.out.println("x의 절댓값 : " + Math.abs(x));
        System.out.println("a와 b의 최댓값 : " + Math.max(a, b));
        System.out.println("a와 b의 최솟값 : " + Math.min(a, b));
        System.out.println("a의 b제곱 : " + Math.pow(a, b));
        System.out.println();

        double n = 5.0;
        System.out.println("e^n 계산 : " + Math.exp(n));
        System.out.println("log n : " + Math.log(n));
        System.out.println("log 10 n : " + Math.log10(n));
        System.out.println();

        System.out.println("2.1 올림 : " + Math.ceil(2.1));
        System.out.println("2.9 내림 : " + Math.floor(2.9));
        System.out.println("2.5 반올림 : " + Math.round(2.5));
        System.out.println();

        System.out.println("9의 제곱근 : " + Math.sqrt(9));
        System.out.println("9의 세제곱근 : " + Math.cbrt(9));
        System.out.println("0.0 ~ 1.0 랜덤 : " + Math.random());
    }
}
