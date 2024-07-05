package start.method;

public class MethodOverloading1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        // 매개변수 갯수가 다를 경우 오버로딩 가능
        System.out.println("add a, b : " + add(a, b));
        System.out.println("add a, b, c : " + add(a, b, c));
        System.out.println("add (double) a, b : " + add(1.5, 1.5));

        // 매개변수 타입이 다르면 오버로딩 가능
        myMethod(1, 1.5);
        myMethod(1.5, 1);


    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    public static double add(double a, double b) {
        System.out.println("3번 호출");
        return a + b;
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
