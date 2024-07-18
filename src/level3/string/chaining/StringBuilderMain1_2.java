package level3.string.chaining;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = sb.append("Do").append("hyeon").append(" ").append("Park") // 1
                .insert(8, "\n") // 2
                .delete(8, 13) // 3
                .reverse() // 4
                .toString();

        System.out.println(s);
    }
}
