package level4.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

    public static void main(String[] args) {
        Map<String, Integer> dohyeonMap = new HashMap<>();

        dohyeonMap.put("dohyeon1", 100);
        dohyeonMap.put("dohyeon2", 90);
        dohyeonMap.put("dohyeon3", 80);
        System.out.println("dohyeonMap = " + dohyeonMap);
        System.out.println();

        Integer result = dohyeonMap.get("dohyeon3");
        System.out.println("dohyeon3의 값 = " + result);
        System.out.println();

        System.out.println("KeySet 활용");
        Set<String> keySet = dohyeonMap.keySet();
        for (String key : keySet) {
            Integer value = dohyeonMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
        System.out.println();

        System.out.println("EntrySet 활용");
        Set<Map.Entry<String, Integer>> entries = dohyeonMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
        System.out.println();

        System.out.println("Values 활용");
        Collection<Integer> values = dohyeonMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
        System.out.println();

        System.out.println("dohyeon1에 999 저장");
        dohyeonMap.put("dohyeon1", 999);
        System.out.println("dohyeonMap = " + dohyeonMap);
        System.out.println();

        System.out.print("dohyeon1 key가 존재하는가? : ");
        boolean result2 = dohyeonMap.containsKey("dohyeon1"); // O(1)
        System.out.println(result2);

        System.out.print("999의 value가 존재하는가? : ");
        boolean result3 = dohyeonMap.containsValue(999); // O(n)
        System.out.println(result3);
        System.out.println();

        System.out.println("dohyeon1 삭제");
        dohyeonMap.remove("dohyeon1");
        System.out.println("dohyeonMap = " + dohyeonMap);
        System.out.println();

        System.out.println("dohyeon4가 없다면 값 999으로 추가");
        dohyeonMap.putIfAbsent("dohyeon4", 999);
        System.out.println("dohyeonMap = " + dohyeonMap);
    }
}
