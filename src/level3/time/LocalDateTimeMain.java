package level3.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("nowDt = " + nowDt);

        LocalDateTime ofDt = LocalDateTime.of(2024, 7, 17, 13, 15, 30);
        System.out.println("ofDt = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산 (불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(3);
        System.out.println("ofDtPlus1Year = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜 시간이 같은가? " + nowDt.isEqual(ofDt));
    }
}
