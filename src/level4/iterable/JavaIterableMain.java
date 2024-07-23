package level4.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // while 순회
        printAll(list.iterator());
        printAll(set.iterator());
        // foreach 순회
        foreach(list);
        foreach(set);
    }

    private static void foreach(Iterable<Integer> iterable) {
        // getClass()를 통한 Iterable의 구현체 확인
        System.out.println("iterable : " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println("i = " + i);
        }
        System.out.println();
    }

    private static void printAll(Iterator<Integer> iterator) {
        // getClass()를 통한 Iterator의 구현체 확인
        System.out.println("iterator : " + iterator.getClass());
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }
        System.out.println();
    }
}
