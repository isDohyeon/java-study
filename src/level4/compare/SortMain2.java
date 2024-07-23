package level4.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println("array = " + Arrays.toString(array));
        System.out.println();

        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("내림차순으로 변경");
        Arrays.sort(array, new DescComparator());
        System.out.println("array = " + Arrays.toString(array));
        Arrays.sort(array, new AscComparator().reversed());
        System.out.println("오름차순 후 반대로 정렬 (AscComparator().reversed())");
        System.out.println("array = " + Arrays.toString(array));
    }

    private static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? -1 : (o1 == o2 ? 0 : 1);
        }
    }

    private static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? -1 : (o1 == o2 ? 0 : 1) * -1;
        }
    }

}
