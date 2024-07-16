package level2.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        int length = sb.length();

        int[] arrlengths = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrlengths[i] = arr[i].length();
            System.out.println(arr[i] + " : " + arrlengths[i]);
        }
        System.out.println("sum = " + length);
    }
}
