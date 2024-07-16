package level2.string.method;

public class StringChangeMain1 {

    public static void main(String[] args) {
        String s = "Hello, My name is Dohyeon";
        String trimS = "    Hello!   ";

        System.out.println("s의 인덱스 7부터의 문자열 : " + s.substring(7));
        System.out.println("s의 인덱스 7부터 14까지의 문자열 : " + s.substring(7, 14));
        System.out.println();
        System.out.println("s의 끝에 ^ㅁ^ 추가 : " + s.concat("^ㅁ^"));
        System.out.println();
        System.out.println("s의 Dohyeon을 Dohyeon Park으로 대체 : " + s.replace("Dohyeon", "Dohyeon Park"));
        System.out.println("s의 o 문자를 ! 문자로 모두 대체 : " + s.replaceAll("o", "!"));
        System.out.println("s의 첫 번째 e 문자를 ! 문자로 대체 : " + s.replaceFirst("e", "!"));
        System.out.println();
        System.out.println("s를 모두 소문자로 변환 : " + s.toLowerCase());
        System.out.println("s를 모두 대문자로 변환 : " + s.toUpperCase());
        System.out.println();
        System.out.println("trimS의 양쪽 공백을 모두 제거 : " + trimS.trim());
    }
}

