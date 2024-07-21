package level4.list;

// 제네릭 클래스 MyLinkedList
public class MyLinkedList<E> implements MyList<E> {

    // 노드의 첫 번째
    private Node<E> first;
    // 노드의 마지막
    private Node<E> last;
    // 노드의 갯수
    private int size = 0;

    // 새로운 값을 노드에 추가, 마지막 노드를 업데이트
    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    // 인덱스를 전달받아 해당 위치에 값 추가
    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
            // 리스트가 비어있을 때 첫 노드를 추가하면 last도 해당 노드를 가리킴
            if (size == 0) {
                last = newNode;
            }
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
            // 새로운 노드가 마지막 노드인 경우 last를 새 노드로 업데이트
            if (newNode.next == null) {
                last = newNode;
            }
        }
        size++;
    }

    // 전달받은 index 위치의 값 제거
    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
            // 리스트가 비게 되면 last를 null로 설정
            if (first == null) {
                last = null;
            }
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
            // 마지막 노드를 제거한 경우 last를 이전 노드로 업데이트
            if (removeNode.next == null) {
                last = prev;
            }
        }
        removeNode.next = null;
        removeNode.item = null;
        size--;
        return removedItem;
    }

    // 인수로 전달받은 index 값에 새로운 값 추가
    // 기존 값을 반환
    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 인수 index 의 값 반환
    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    // 인수 index 의 노드 참조값 반환
    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // 인수로 전달받은 값이 노드 몇 번째에 있는지 인덱스 값 반환
    // 없다면 -1 반환
    @Override
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // 노드 갯수 (size) 반환
    @Override
    public int size() {
        return size;
    }

    // MyLinkedList 정보
    @Override
    public String toString() {
        return "노드 = " + first +
                ", size=" + size;
    }

    // 내부 클래스 Node - MyLinkedList 에서만 사용됨
    // E 타입 노드의 현재 값과 다음 노드의 참조 정보
    private static class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // 모든 노드의 정보
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append(" -> ");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
