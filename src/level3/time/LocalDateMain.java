package level3.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 : " + nowDate);

        LocalDate ofDate = LocalDate.of(2024, 7, 16);
        System.out.println("지정 날짜 : " + ofDate);

        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10일 : " + plusDays);

    }
}
