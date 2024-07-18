package level3.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        String s = "Dohyeon Park";
        int n = 1000;
        boolean bool = true;
        Object myObj = new Object();

        String s1 = String.valueOf(n);
        System.out.println("정수 n을 문자열로 변환 : " + s1);
        String s2 = String.valueOf(bool);
        System.out.println("true를 문자열로 변환 : " + s2);
        String s3 = String.valueOf(myObj);
        System.out.println("객체의 문자열 값 : " + s3);
        System.out.println();
        char[] charArr = s.toCharArray();
        System.out.print("s를 문자 배열로 변환 후 출력 : ");
        for (char c : charArr) {
            System.out.print(c);
        }
        System.out.println();
        String format1 = String.format("num : %d, bool : %b, str : %s", n, bool, s);
        System.out.println(format1);
        System.out.println();

        double f = 1.2345;
        System.out.println("원래의 소수 : " + f);
        String format2 = String.format("format을 통한 소수 2번째 자리까지 출력 : %.2f", f);
        System.out.println(format2);
        System.out.printf("printf를 통한 소수 2번째 자리까지 출력 : %.2f", f);
        System.out.println('\n');

        String regex = "Dohyeon (Park|Kim)";
        System.out.println("s가 패턴과 일치하는가? : " + s.matches(regex)); // boolean 반환
    }
}
