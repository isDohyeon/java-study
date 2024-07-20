package level4.collection.link;

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
        System.out.println("Integer 리스트 1 ~ 6 toString : " + integerList);
        System.out.println("Integer 리스트 크기 : " + integerList.size());
        System.out.println("index 2의 값 : " + integerList.get(2));
        System.out.println("값 3의 index : " + integerList.indexOf(3));
        integerList.set(2, 99);
        System.out.println("index 2를 99로 변경된 리스트 : " + integerList);
        integerList.remove(4);
        System.out.println("index 4 삭제 후 리스트 : " + integerList);
        System.out.println();
    }
}
