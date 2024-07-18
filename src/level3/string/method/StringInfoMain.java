package level3.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String s = "Dohyeon Park";

        System.out.println("s 문자열 길이 : " + s.length()); // int 반환
        System.out.println("s 문자열이 비어 있는지 : " + s.isEmpty()); // boolean 반환
        System.out.println("s 문자열이 비어 있거나 공백인지 : " + s.isBlank()); // boolean 반환
        System.out.println("문자열이 비어 있거나 공백인지 2 : " + "   ".isBlank()); // boolean 반환

        char c = s.charAt(0); // char 반환
        System.out.println("첫 번째 인덱스의 문자 : " + c);
        System.out.print("s 문자열 문자 인덱스 순서대로 하나씩 출력 : ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}
