package level2.access.ex;

public class MaxCounter {

    private int count;
    private int max;

    public MaxCounter(int max) {
        count = 0;
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다. 최대값 : " + max + ", 현재값 : " + count);
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
