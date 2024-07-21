package level4.hashset.ex;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>(List.of(inputArr));
        for (Integer index : set) {
            System.out.println("index = " + index);
        }
    }
}
