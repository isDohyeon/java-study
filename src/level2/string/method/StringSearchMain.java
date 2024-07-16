package level2.string.method;

public class StringSearchMain {

    public static void main(String[] args) {
        String s = "My name is Dohyeon Park, isDohyeon";

        System.out.println("s에 Dohyeon이 포함되어 있는지 : " + s.contains("Dohyeon")); // boolean 반환
        System.out.println();
        System.out.println("s에 Dohyeon이 처음 등장하는 인덱스 : " + s.indexOf("Dohyeon")); // int 반환
    }
}
