package level2.time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalTime ofTime = LocalTime.of(13, 12, 30);
        System.out.println("ofTime = " + ofTime);

        LocalTime ofTimePlus = ofTime.plusSeconds(60);
        System.out.println("ofTimePlus = " + ofTimePlus);
    }
}
