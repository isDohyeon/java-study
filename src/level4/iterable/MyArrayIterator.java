package level4.iterable;

import java.util.Iterator;

// Iterator 인터페이스의 구현체
public class MyArrayIterator implements Iterator<Integer> {

    // 현재 인덱스 - next() 메서드에서 전위 증가하기 때문에 초기값 -1
    private int currentIndex = -1;
    // 순회할 배열
    private int[] targetArr;

    // 생성자 - 순회할 배열 참조
    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    // 다음 인덱스가 존재하는지 검사
    // 마지막 인덱스에 도달하면 false 반환
    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    //다음 인덱스를 반환.
    // 전위 증가이므로 첫 인덱스가 0부터 시작
    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
