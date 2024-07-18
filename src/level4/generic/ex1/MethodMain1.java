package level4.generic.ex1;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Integer result = GenericMethod.genericMethod(i);
        System.out.println("result = " + result);

        Integer num = GenericMethod.numberMethod(20);
        Integer num2 = GenericMethod.genericMethod(30);

        //String s1 = GenericMethod.numberMethod("hello"); // 불가
        String s1 = GenericMethod.genericMethod("hello"); // 가능
    }
}
