package level3.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] splited = fruits.split(",");
        for (String s : splited) {
            System.out.println(s);
        }

        String joinFruits = String.join("-", splited);
        System.out.println(joinFruits);
    }
}
