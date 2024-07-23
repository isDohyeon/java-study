package level4.deque.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        Task task = tasks.peek();
        if (task != null) {
            task.execute();
        }
        tasks.poll();
    }
}
