package level3.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String s = "Dohyeon Park";
        String[] splitS = s.split(" ");
        System.out.println("s를 공백으로 구분한 첫 번째 문자열 : " + splitS[0]);
        System.out.println("s를 공백으로 구분한 두 번째 문자열 : " + splitS[1]);
        System.out.println();

        String joinedS = String.join("->", "1", "2", "3");
        System.out.println("연결된 문자열 : " + joinedS);
        System.out.println();
    }
}
