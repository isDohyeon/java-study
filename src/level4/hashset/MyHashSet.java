package level4.hashset;

import java.util.Arrays;
import java.util.LinkedList;

// MySet 인터페이스 상속받은 제네릭 타입 - 타입 안정성
public class MyHashSet<E> implements MySet<E> {

    // 기본 수용량
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    // 배열 형태의 LinkedList - 모든 데이터 타입을 담을 수 있음
    private LinkedList<E>[] buckets;

    // 현재 데이터 양
    private int size = 0;
    // 현재 수용량
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    // 생성자 1 - 기본 수용량만큼 buckets 에 LinkedList 생성
    public MyHashSet() {
        initBuckets();
    }

    // 생성자 2 - 입력받은 수용량 만큼 buckets 에 LinkedList 생성
    public MyHashSet(int capacity) {
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

    // hashIndex 반환 - 데이터의 해시 코드의 절댓값 % 수용량
    private int hashIndex(E value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    // hashIndex 에 데이터 추가
    // 이미 값이 존재하면 false 반환 - 유일성 보장
    // 존재하지 않으면 값 추가 후 size 1 증가
    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    // 데이터가 중복되는지 (갖고 있는지) - 있다면 true
    public boolean contains(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }

    // 전달받은 데이터를 래퍼 타입의 값을 기준으로 찾아서 삭제 (index 값이 아님)
    // 지워졌다면 size-- 후 true
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean isRemoved = bucket.remove(value);
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
        return "MyHashSet{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
