package level1.method;

public class MethodValue0 {
    public static void main(String[] args) {
//        **자바는 항상 변수의 값을 복사해서 대입한다.**
//        복사한다고 표현한 이유는 `num1` 의 값을 읽어도 `num1` 에 있는 기존 값이 유지되고,
//        새로운 값이 `num2` 에 들어가기 때문이다.
//        마치 `num1` 의 값이 `num2` 에 복사가 된 것 같다.
//        `num1` 이라는 변수 자체가 `num2` 에 들어가는 것이 아니다.
//        `num1` 에 들어있는 값을 읽고 복사해서 `num2` 에 넣는 것이다.
//         간단하게 `num1` 에 있는 값을 `num2` 에 대입한다고 표현한다. 하지만 실제로는 그 값을 복사해서 대입하는 것이다.
        int num1 = 5; // num1의 값은 5이다.
        int num2 = num1; // num2 변수에 대입하기 전에 num1의 값 5를 읽는다.
        num2 = 10; // num2에 10을 대입한다.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
