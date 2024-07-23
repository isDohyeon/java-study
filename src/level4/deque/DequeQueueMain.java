package level4.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> dequeQueue = new ArrayDeque<>();

        System.out.println("큐 처럼 데이터 1, 2, 3 뒤로 삽입");
        System.out.println("dequeQueue = " + dequeQueue);
        dequeQueue.offer(1);
        System.out.println("dequeQueue.offer(1) = " + dequeQueue);
        dequeQueue.offer(2);
        System.out.println("dequeQueue.offer(2) = " + dequeQueue);
        dequeQueue.offer(3);
        System.out.println("dequeQueue.offer(3) = " + dequeQueue);
        System.out.println();

        System.out.println("큐 처럼 다음 꺼낼 데이터 조회");
        System.out.println("dequeQueue.peek() = " + dequeQueue.peek());
        System.out.println();

        System.out.println("큐 처럼 데이터 앞에서부터 삭제");
        System.out.println("dequeQueue = " + dequeQueue);
        dequeQueue.poll();
        System.out.println("dequeQueue.poll() = " + dequeQueue);
        dequeQueue.poll();
        System.out.println("dequeQueue.poll() = " + dequeQueue);
        dequeQueue.poll();
        System.out.println("dequeQueue.poll() = " + dequeQueue);
    }
}
