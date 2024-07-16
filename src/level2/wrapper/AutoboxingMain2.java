package level2.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value;
        System.out.println("boxedValue = " + boxedValue);
        int unboxedValue = boxedValue;
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
