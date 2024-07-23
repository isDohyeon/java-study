package level4.deque.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String page) {
        history.push(page);
        currentPage = history.peek();
        System.out.println("방문 : " + currentPage);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            history.pop();
            currentPage = history.peek();
            System.out.println("뒤로가기 : " + currentPage);
            return currentPage;
        }
        return null;
    }
}
