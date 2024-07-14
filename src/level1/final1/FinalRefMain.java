package level1.final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); // 변경 불가

        //인스턴스 변수의 값은 변경 가능
        data.value = 10;
        data.value = 20;

    }
}
