package level2.oop;

public class MusicPlayer {

    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("시작");
    }

    void off() {
        isOn = false;
        System.out.println("종료");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨 증가. 볼륨 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨 감소. 볼륨 : " + volume);
    }

    void showStatus() {
        System.out.print("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 on, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 off");
        }
    }
}
