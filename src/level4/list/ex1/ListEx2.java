package level4.list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        System.out.println("n 개의 정수 입력, 종료 : 0");

        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("출력");
        for (Integer i : numbers) {
            System.out.print(i);
            if (i < numbers.size()) {
                System.out.print(", ");
            }
        }
    }
}
