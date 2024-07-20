package level4.linkedlist;

public class NodeMain1 {

    public static void main(String[] args) {
        // 노드 생성 후 연결 A -> B -> C
        Node first1 = new Node("A");
        first1.next = new Node("B");
        first1.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
        Node x = first1;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
