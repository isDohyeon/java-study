package level3.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String s1 = "Dohyeon Park";
        String s2 = "dohyeon park";
        String s3 = "Park do hyeon";

        System.out.println("s1 equals s2? : " + s1.equals(s2)); // boolean 반환
        System.out.println("s1 equalsIgnoreCase s2 ? : " + s1.equalsIgnoreCase(s2)); // boolean 반환
        System.out.println();
        System.out.println("a와 b의 ASCII 값 차이 : " + "a".compareTo("b")); // int 반환
        System.out.println("s1와 s2의 첫 번째 문자의 ASCII 값 차이 : " + s1.compareTo(s2)); // int 반환
        System.out.println("s1와 s3의 첫 번재 문자의 ASCII 값 차이 : " + s1.compareTo(s3)); // int 반환
        System.out.println("s1와 s2의 첫 번째 문자 ASCII 값 차이, 대소문자 구분x : " + s1.compareToIgnoreCase(s2)); // int 반환
        System.out.println();
        System.out.println("s1의 맨 앞부분이 'Dohyeon'으로 시작하는가? : " + s1.startsWith("Dohyeon")); // true
        System.out.println("s1의 맨 뒷부분이 'Park'으로 끝나는가? : " + s1.endsWith("Park")); // true
        System.out.println("s1의 맨 앞부분이 'Dohyeon P'으로 시작하는가? : " + s1.startsWith("Dohyeon P")); // true
        System.out.println("s1의 맨 뒷부분이 'n Park'으로 끝나는가? : " + s1.endsWith("n Park")); // true
        System.out.println("s1의 맨 뒷부분이 'Park1'으로 끝나는가? : " + s1.endsWith("Park1")); // false
        System.out.println("s1의 맨 앞부분이 '1Dohyeon'으로 시작하는가? : " + s1.startsWith("1Dohyeon")); // false
    }
}
