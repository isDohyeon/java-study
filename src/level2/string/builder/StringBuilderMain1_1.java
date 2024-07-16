package level2.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("do");
        sb.append("hyeon");
        sb.append("Park");
        System.out.println(sb);

        sb.insert(7 ," ");
        System.out.println(sb);

        sb.delete(7, 12);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String s = sb.toString();
        System.out.println("문자열 : " + s);
    }
}
