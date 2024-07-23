package level4.hashset.test;

public class MyHashSetV0Main {

    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("set = " + set);

        boolean result = set.add(4);
        System.out.println("4를 추가했을 때 저장되었는가? = " + result);

        System.out.println("set.contains(3): " + set.contains(3));
        System.out.println("set.contains(99): " + set.contains(99));
    }
}
