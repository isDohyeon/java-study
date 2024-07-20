package level4.linkedlist;

public class MyLinkedListMain {

    public static void main(String[] args) {
        // MyLinkedList<Integer> 인스턴스 생성 및 사용
        MyLinkedList<Integer> integerList = new MyLinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        System.out.println("integerList : " + integerList);
        System.out.println("size() : " + integerList.size());
        System.out.println("get(2) : " + integerList.get(2));
        System.out.println("indexOf(3) : " + integerList.indexOf(3));
        integerList.set(2, 99);
        System.out.println("set(2, 99)로 변경된 리스트 : " + integerList);
        integerList.remove(4);
        System.out.println("remove(4) 후 리스트 : " + integerList);
        System.out.println();
    }
}
