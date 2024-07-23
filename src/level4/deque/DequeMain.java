package level4.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("데이터 앞쪽부터 1, 2 추가");
        deque.offerFirst(1);
        System.out.println("deque = " + deque);
        deque.offerFirst(2);
        System.out.println("deque = " + deque);
        System.out.println("데이터 뒤쪽부터 3, 4 추가");
        deque.offerLast(3);
        System.out.println("deque = " + deque);
        deque.offerLast(4);
        System.out.println("deque = " + deque);
        System.out.println();

        System.out.println("앞에서 꺼낼 데이터 확인 : " + deque.peekFirst());
        System.out.println("뒤에서 꺼낼 데이터 확인 : " + deque.peekLast());
        System.out.println();

        System.out.println("현재 덱 = " + deque);
        System.out.println("앞에서부터 2, 1 삭제");
        deque.pollFirst();
        System.out.println("deque = " + deque);
        deque.pollFirst();
        System.out.println("deque = " + deque);
        System.out.println("뒤에서부터 4, 3 삭제");
        deque.pollLast();
        System.out.println("deque = " + deque);
        deque.pollLast();
        System.out.println("deque = " + deque);
    }
}
