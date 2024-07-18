package level3.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 7, 17, 15, 19, 30);
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.YEAR));
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.MINUTE_OF_HOUR));

        System.out.println("편의 메서드");
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.getYear());
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.getMonth());
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.getDayOfMonth());

    }
}
