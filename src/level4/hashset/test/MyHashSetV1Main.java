package level4.hashset.test;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        // 검색
        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println(searchValue + " 값이 들어있는가? : " + result);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("삭제 여부 = " + removeResult);
        System.out.println(set);

    }
}
