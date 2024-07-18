package level2.ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 : " + dataA); // A의 주소
        System.out.println("datab 참조값 : " + dataB);
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        dataA.value = 20;
        System.out.println("A 20으로 변경 후 A: " + dataA.value);
        System.out.println("A 20으로 변경 후 B의 값 : " + dataB.value);

        dataB.value = 30;
        System.out.println("B 30으로 변경 후 A: " + dataA.value);
        System.out.println("B 30으로 변경 후 B: " + dataB.value);


    }
}
