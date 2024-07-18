package level3.nested;

public class AnonymousMain {

    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Hello.hello");
        hello.hello();
    }
}
