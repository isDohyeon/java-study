package start.method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1); changeNumber(num1);
        System.out.println("4. changeNumber 호출 후, num1: " + num1);
        /*
        결과적으로 매개변수 `num2` 의 값만 10으로 변경되고 `num1` 의 값은 변경되지 않고 기존 값인 5로 유지된다.
        자바는 항상 값을 복사해서 전달하기 때문에 `num2` 의 값을 바꾸더라도 `num1` 에는 영향을 주지 않는다.
         */
    }
    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2); num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }
}