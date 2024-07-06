package basic.ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null; // Data 타입의 참조형 변수 data 에 null 값 핣당
        System.out.println("1. data = " + data);
        data = new Data(); // 새로운 Data형 객체 생성, data에 할당, Data 인스턴스 주소값 참조
        System.out.println("2. data = " + data);
        data = null; // 다시 null값 할당, Data 인스턴스를 참조하지 않게 됨
        System.out.println("3. data = " + data);
    }
}
