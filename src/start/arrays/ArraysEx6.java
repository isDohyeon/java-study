package start.arrays;

import java.util.Scanner;

public class ArraysEx6 {
    public static void main(String[] args) {
//        실행 결과 예시**
//        입력받을 숫자의 개수를 입력하세요:3
//        3개의 정수를 입력하세요:
//        1
//        2
//        5
//        가장 작은 정수:1
//        가장 큰 정수:5
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 개수 입력: ");
        int n = sc.nextInt();

        int[] numbers = new int[5];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int minNum = numbers[0];
        int maxNum = numbers[0];
        for (int i = 1; i < n; i++) {
            if (minNum < numbers[i]) {
                minNum = numbers[i];
            }
            if (maxNum > numbers[i]) {
                maxNum = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);

    }
}
