package level3.nested;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 outer2 = new OuterClass2();
        OuterClass2.InnerClass innerClass = outer2.new InnerClass();
        innerClass.hello();
    }
}
