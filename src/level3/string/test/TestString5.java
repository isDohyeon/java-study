package level3.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int txtIndex = str.indexOf(".txt");
        String str1 = str.substring(0, txtIndex);
        String str2 = str.substring(txtIndex);

        System.out.println(str1);
        System.out.println(str2);
    }
}
