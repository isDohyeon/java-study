package basic.oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 시작
        on(data);
        // 상태 확인
        status(data);
        // 볼륨 +1
        volumeUp(data);
        // 상태 확인
        status(data);
        // 볼륨 -1
        volumeDown(data);
        // 상태 확인
        status(data);
        // 끄기
        off(data);
        // 상태 확인
        status(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void status(MusicPlayerData data) {
        System.out.print("음악 플레이어 상태 확인 : ");
        if (data.isOn) {
            System.out.println("음악 플레이어 : ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 : OFF");
        }
    }
}
