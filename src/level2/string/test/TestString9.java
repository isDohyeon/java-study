package level2.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] splited = email.split("@");
        for (String s : splited) {
            System.out.println(s);
        }
    }
}
