package level2.ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println(bigData.count); // Bigdata 주소에 있는 count 값
        System.out.println(bigData.data); // Data 인스턴스의 참조 값 (주소)
        System.out.println(bigData.data.value); // Bigdata 클래스의 data 인스턴스의 주소에 있는 value 값

    }
}
