package level2.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2025, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("formatted = " + formatted);
        System.out.println(now);

        // 파싱 : 문자 -> 날짜, 시간
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsed = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("parsed = " + parsed);
    }
}
