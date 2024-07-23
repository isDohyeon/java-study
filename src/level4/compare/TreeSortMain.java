package level4.compare;

import java.util.TreeSet;

public class TreeSortMain {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 20);
        MyUser user2 = new MyUser("b", 10);
        MyUser user3 = new MyUser("c", 30);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(user1);
        treeSet1.add(user2);
        treeSet1.add(user3);
        System.out.println("== 기본 정렬 ==");
        System.out.println("나이 기준 정렬 = " + treeSet1);
        System.out.println();

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new NameComparator());
        treeSet2.add(user1);
        treeSet2.add(user2);
        treeSet2.add(user3);
        System.out.println("== NameComparator ==");
        System.out.println("이름 기준 정렬 = " + treeSet2);
    }
}
