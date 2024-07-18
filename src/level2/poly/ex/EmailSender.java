package level2.poly.ex;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String s) {
        System.out.println("메일을 발송합니다 : " + s);
    }
}
