package level3.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("현재시간 : 밀리초 = " + currentTimeMillis);

        long nanoTime = System.nanoTime();
        System.out.println("현재시간 - 나노초 = " + nanoTime);

        System.out.println("환경 변수 : " + System.getenv());

        System.out.println("시스템 속성 : " + System.getProperties());

        char[] arr = {'d', 'o', 'h', 'y', 'e', 'o', 'n'};
        char[] copyArr = new char[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        System.out.println("고속 복사 배열 출력 : " + Arrays.toString(copyArr));
    }
}
