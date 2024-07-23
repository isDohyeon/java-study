package level4.iterable;

import java.util.Iterator;

// Iterable 인터페이스의 구현체 - 간단한 배열 자료구조
public class MyArray implements Iterable<Integer> {

    // 순회할 배열
    private int[] numbers;

    // 생성자
    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    // 이 자료 구조에 사용할 반복 반한
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
