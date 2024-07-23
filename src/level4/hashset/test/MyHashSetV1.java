package level4.hashset.test;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    // 기본 수용량
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    // 배열 형태의 LinkedList
    LinkedList<Integer>[] buckets;

    // 현재 데이터 양
    private int size = 0;
    // 현재 수용량
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    // 생성자 1 - 기본 수용량만큼 buckets 에 LinkedList 생성
    public MyHashSetV1() {
        initBuckets();
    }

    // 생성자 2 - 입력받은 수용량 만큼 buckets 에 LinkedList 생성
    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    // 설정된 수용량 만큼 buckets 에 LinkedList 생성
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // hashIndex 반환 - 데이터값 % 수용량
    private int hashIndex(int value) {
        return value % capacity;
    }

    // hashIndex 에 데이터 추가
    // 이미 값이 존재하면 false 반환 - 유일성 보장
    // 존재하지 않으면 값 추가 후 size 1 증가
    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    // 데이터가 중복되는지 (갖고 있는지) - 있다면 true
    public boolean contains(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    // 전달받은 데이터를 래퍼 타입의 값을 기준으로 찾아서 삭제 (index 값이 아님)
    // 지워졌다면 size-- 후 true
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean isRemoved = bucket.remove(Integer.valueOf(value));
        if (isRemoved) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    // 현재 데이터 양
    public int getSize() {
        return size;
    }

    // toString
    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
