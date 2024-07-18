package level2.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        System.out.println("currentDate = " + currentDate);
        // 특정 날짜 더하기
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("plusDate = " + plusDate);

        // 기간 차이
        LocalDate startDate = LocalDate.of(2024, 7, 17);
        LocalDate endDate = LocalDate.of(2024, 8, 30);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between);
        System.out.println(between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
