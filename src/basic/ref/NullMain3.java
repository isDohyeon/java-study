package basic.ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NPE : null에 .을 찍으면 발생 -> bigData.data = null
        System.out.println("bigdata.data.value = " + bigData.data.value);

    }
}
