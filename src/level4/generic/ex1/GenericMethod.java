package level4.generic.ex1;

public class GenericMethod {

    public static <T> T genericMethod(T t) {
        System.out.println("genericMethod : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("numberMethod : " + t);
        return t;
    }
}
