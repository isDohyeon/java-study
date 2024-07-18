package level3.enummuration.test;

import java.util.Scanner;

public class AuthGradeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.next();
        getInfo(AuthGrade.valueOf(grade));
    }

    private static void getInfo(AuthGrade grade) {
        System.out.println("당신의 등급은 " + grade.getDescription(grade) + "입니다.\n" + "==메뉴 목록==");
        if (grade.getLevel(grade) > 0) {
            System.out.println("- 메인 화면");
        }
        if (grade.getLevel(grade) > 1) {
            System.out.println("- 메인 화면");
        }
        if (grade.getLevel(grade) > 2){
            System.out.println("- 관리자 화면");
        }
    }
}
