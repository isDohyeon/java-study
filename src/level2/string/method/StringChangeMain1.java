package level2.string.method;

public class StringChangeMain1 {

    public static void main(String[] args) {
        String s = "Hello, My name is dohyeon";

        System.out.println("s의 인덱스 7부터의 문자열 : " + s.substring(7));
        System.out.println("s의 인덱스 7부터 14까지의 문자열 : " + s.substring(7, 14));
        System.out.println();
        System.out.println("s의 끝에 ^ㅁ^ 추가 : " + s.concat("^ㅁ^"));

    }
}
