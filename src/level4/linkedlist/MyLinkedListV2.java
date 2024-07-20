package level4.linkedlist;

public class MyLinkedListV2 {

    // 노드의 첫 번째
    private Node first;
    // 노드의 갯수
    private int size = 0;


    // 새로운 값을 마지막 노드에 추가
    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    // 인덱스를 전달받아 해당 위치에 값 추가
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.next = null;
        removeNode.item = null;
        size--;
        return removedItem;
    }

    // 마지막 노드 참조 반환
    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 인수로 전달받은 index 값에 새로운 값 추가
    // 기존 값을 반환
    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 인수 index 의 값 반환
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    // 인수 index 의 노드 참조값 반환
    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // 인수로 전달받은 값이 노드 몇 번째에 있는지 인덱스 값 반환
    // 없다면 -1 반환
    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // 노드 갯수 (size) 반환
    public int size() {
        return size;
    }

    // MyLinkedList 정보
    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
