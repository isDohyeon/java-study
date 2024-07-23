package level4.compare;

import java.util.Comparator;

// 이름 기준 정렬 구현체
public class NameComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
