package level1.static2;

public class MathArrayUtils {

    private MathArrayUtils() {
        // private : 인스턴스 생성을 막는다.
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = 0;
        for (int i : array) {
            min = Math.min(min, i);
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i : array) {
            max = Math.max(max, i);
        }
        return max;
    }
}
