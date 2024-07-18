package level3.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {

    public static void main(String[] args) {
        // 포맷팅 : 날짜를 문자로
        LocalDate date = LocalDate.of(2024, 7, 17);
        System.out.println("date = " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formatted = date.format(formatter);
        System.out.println("formatted = " + formatted);

        // 파싱
        String input = "2024년 01월 01일";
        LocalDate parsed = LocalDate.parse(input, formatter);
        System.out.println("parsed = " + parsed);
    }
}
