package level4.collection.array;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println("arr = " + Arrays.toString(arr));

        // 기존 배열의 데이터를 한칸씩 뒤로 밀고 배열의 첫 번째 위치에 데이터 추가 - O(n)
        System.out.println("배열의 첫 번째 위치에 데이터 추가");
        int newValue1 = 3;
        addFirst(arr, newValue1);
        System.out.println("arr add newValue1 = " + Arrays.toString(arr));

        // 기존 배열의 index 까지의 데이터를 한 칸씩 뒤로 밀고 index 위치에 데이터 추가 - O(n)
        System.out.println("배열의 index 위치에 데이터 추가");
        int newValue2 = 4;
        int index = 2;
        addIndex(arr, newValue2, index);
        System.out.println("arr add newValue2 = " + Arrays.toString(arr));

        // 배열의 마지막 인덱스에 바로 데이터 추가 - O(1)
        System.out.println("배열의 마지막 위치에 데이터 추가");
        int newValue3 = 5;
        addLast(arr, newValue3);
        System.out.println("arr add newValue3 = " + Arrays.toString(arr));
    }

    private static void addLast(int[] arr, int newValue3) {
        arr[arr.length - 1] = newValue3;
    }

    private static void addIndex(int[] arr, int newValue2, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue2;
    }

    private static void addFirst(int[] arr, int newValue1) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue1;
    }
}
