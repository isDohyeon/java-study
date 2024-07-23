package level4.deque.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {

    public static void main(String[] args) {
        Deque<String> historyStack = new ArrayDeque<>();
        historyStack.push("youtube.com");
        historyStack.push("google.com");
        historyStack.push("facebook.com");

        System.out.println("historyStack.pop() = " + historyStack.pop());
        System.out.println("historyStack.pop() = " + historyStack.pop());
        System.out.println("historyStack.pop() = " + historyStack.pop());
    }
}
