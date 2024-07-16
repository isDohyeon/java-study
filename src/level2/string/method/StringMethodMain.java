package level2.string.method;

public class StringMethodMain {

    public static void main(String[] args) {
        String s = "Dohyeon Park";
        String[] splitS = s.split(" ");
        System.out.println("s를 공백으로 구분한 첫 번째 문자열 : " + splitS[0]);
        System.out.println("s를 공백으로 구분한 두 번째 문자열 : " + splitS[1]);
        System.out.println();

        String joinedS = String.join("->", "1", "2", "3");
        System.out.println("연결된 문자열 : " + joinedS);
        System.out.println();

        int n = 1000;
        boolean bool = true;
        Object myObj = new Object();

        String s1 = String.valueOf(n);
        System.out.println("정수 n을 문자열로 변환 : " + s1);
        String s2 = String.valueOf(bool);
        System.out.println("true를 문자열로 변환 : " + s2);
        String s3 = String.valueOf(myObj);
        System.out.println("객체의 문자열 값 : " + s3);

        char[] charArr = s.toCharArray();
        System.out.print("s를 문자 배열로 변환 후 출력 : ");
        for (char c : charArr) {
            System.out.print(c);
        }
    }
}
