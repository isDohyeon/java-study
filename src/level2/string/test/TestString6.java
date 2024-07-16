package level2.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 1;
        int index = str.indexOf(key);
        for (int i = str.indexOf(key); i < str.length(); i += index) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println(count);
    }
}
