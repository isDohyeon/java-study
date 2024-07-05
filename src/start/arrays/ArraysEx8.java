package start.arrays;

import java.util.Scanner;

public class ArraysEx8 {
    public static void main(String[] args) {
//        **실행 결과 예시**
//```
//        학생수를 입력하세요:3
//        1번 학생의 성적을 입력하세요: 국어 점수:10
//        영어 점수:20
//        수학 점수:30
//        2번 학생의 성적을 입력하세요: 국어 점수:10
//        영어 점수:10
//        수학 점수:10
//        3번 학생의 성적을 입력하세요:
//        국어 점수:20
//        영어 점수:20
//        수학 점수:20
//        1번 학생의 총점: 60, 평균: 20.0
//        2번 학생의 총점: 30, 평균: 10.0
//        3번 학생의 총점: 60, 평균: 20.0

        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int num = sc.nextInt();

        int[][] scores = new int[num][3];
        String[] subjects = {"국어", "수학", "영어"};
        int[] sum = new int[num];
        double[] avg = new double[num];


        for (int i = 0; i < num; i++) {
            System.out.println(i+1 + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = sc.nextInt();
                sum[i] += scores[i][j];
            }
            avg[i] = (double) sum[i] / 3;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(i+1 + "번 학생의 총점: " + sum[i] + ", 평균: " + avg[i]);
        }

    }
}
