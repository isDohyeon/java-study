package level4.list.ex1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        System.out.println("n 개의 정수 입력, 종료 : 0");


        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
            sum += input;
        }
        double avg = (double) sum / numbers.size();
        System.out.println("입력한 정수 합계 : " + sum);
        System.out.println("입력한 정수 평균 : " + avg);
    }
}
