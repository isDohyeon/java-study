package level1.method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1 : " + num1); // 5
        num1 = changeNum(num1); // 메서드 호출 결과를 반환받아 값에 새로 저장 (10)
        System.out.println("changeNumber 호출 후, num1 : " + num1); // 10

    }
    public static int changeNum(int num2) {
        num2 = num2 * 2;
        return num2; // 10
    }
}
