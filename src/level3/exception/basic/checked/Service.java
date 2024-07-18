package level3.exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외 잡아서 처리
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외 처리 " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    // 예외 밖으로 던지기
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
