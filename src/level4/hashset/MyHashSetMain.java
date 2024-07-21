package level4.hashset;

public class MyHashSetMain {

    public static void main(String[] args) {
        // Integer HashSet
        MyHashSet<Integer> set1 = new MyHashSet<>(10);
        System.out.println("===== Integer MyHashSet =====");
        // 데이터 추가
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("set1 = " + set1);
        // 데이터 검색
        System.out.println("3이 존재하는가? : " + set1.contains(3));
        System.out.println("99가 존재하는가? : " + set1.contains(99));
        // 데이터 삭제
        set1.remove(1);
        System.out.println("1 삭제 : " + set1);
        boolean result = set1.remove(99);
        System.out.println("99를 삭제할 수 있는가? : " + result);
        System.out.println();
        // Integer HashSet
        System.out.println("===== String MyHashSet =====");
        MyHashSet<String> set2 = new MyHashSet<>(10);
        // 데이터 추가
        set2.add("dohyeon");
        set2.add("Park");
        set2.add("Java");
        set2.add("Spring");
        System.out.println("set2 = " + set2);
        // 데이터 검색
        System.out.println("'Java'가 존재하는가? : " + set2.contains("Java"));
        System.out.println("'abc'가 존재하는가? : " + set2.contains("abc"));
        // 데이터 삭제
        set2.remove("dohyeon");
        System.out.println("'dohyeon' 삭제 : " + set2);
        boolean result2 = set2.remove("abc");
        System.out.println("'abc'를 삭제할 수 있는가? : " + result2);


    }
}
