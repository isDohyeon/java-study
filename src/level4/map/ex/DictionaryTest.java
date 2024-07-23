package level4.map.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String eng = sc.nextLine();
            if (eng.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 : ");
            String kor = sc.nextLine();

            map.put(eng, kor);
        }

        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String eng = sc.nextLine();
            if (eng.equals("q")) {
                break;
            }

            if (map.containsKey(eng)) {
                System.out.println(eng + "의 뜻 : " + map.get(eng));
            } else {
                System.out.println(eng + "은 사전에 없읍니다.");
            }
        }
    }
}
