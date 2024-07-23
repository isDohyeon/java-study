package level4.hashset.test;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    // Set에 중복된 값이 있는지 체크
    // 없다면 값을 추가하고 true 반환
    // 있다면 false 반환
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        elementData[size] = value;
        size++;
        return true;
    }

    // 중복된 값이 있는가를 체크
    // 있다면 true 반환
    // 없다면 false 반환
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    // 현재 저장된 값 갯수 반환 (size)
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
