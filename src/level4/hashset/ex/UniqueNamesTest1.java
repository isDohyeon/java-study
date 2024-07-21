package level4.hashset.ex;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArr));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
