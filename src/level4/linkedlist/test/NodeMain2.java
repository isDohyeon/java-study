package level4.linkedlist.test;

public class NodeMain2 {

    public static void main(String[] args) {
        Node first2 = new Node("A");
        first2.next = new Node("B");
        first2.next.next = new Node("C");

        System.out.println(first2);
    }
}
