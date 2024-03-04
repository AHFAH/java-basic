package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String str) {
        System.out.println("페이스북 메세지를 발송합니다: " + str);
    }
}
