package level2.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("10");
        int value = Integer.parseInt("10");

        // i1 > i2 라면 1 반환
        int i2 = 9;
        int compareResult = i1.compareTo(i2);
        System.out.println("compareResult = " + compareResult);
        // i1 == i2 라면 0 반환
        i2 = 10;
        compareResult = i1.compareTo(i2);
        System.out.println("compareResult = " + compareResult);
        // i1 < i2 라면 -1 반환
        i2 = 11;
        compareResult = i1.compareTo(i2);
        System.out.println("compareResult = " + compareResult);
        System.out.println();

        // 두 값의 합 반환
        int sum = Integer.sum(i1, i2);
        System.out.println("sum = " + sum);
        // 두 값중 큰 값 반환
        int min = Integer.min(i1, i2);
        System.out.println("min = " + min);
        // 두 값중 작은 값 반환
        int max = Integer.max(i1, i2);
        System.out.println("max = " + max);
    }
}
