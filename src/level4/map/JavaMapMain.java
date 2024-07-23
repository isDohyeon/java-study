package level4.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        System.out.println("HashMap : 입력 순서 보장 x");
        run(new HashMap<>());
        System.out.println();
        System.out.println("LinkedHashMap : 입력 순서 보장 o");
        run(new LinkedHashMap<>());
        System.out.println();
        System.out.println("TreeMap : 값에 따른 정렬");
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        map.put("B", 10);
        map.put("A", 20);
        map.put("12", 345);
        map.put("67", 89);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.print(key + " = " + map.get(key) + ", ");
        }
        System.out.println();
    }
}
