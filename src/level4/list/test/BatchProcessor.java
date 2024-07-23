package level4.list.test;

import level4.list.MyList;

public class BatchProcessor {

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTIme = System.currentTimeMillis();
        System.out.println("데이터 크기 : " + size + ", 걸린 시간 : " + (endTIme - startTime) + "ms");
    }
}
