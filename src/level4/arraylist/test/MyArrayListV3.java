package level4.arraylist.test;

import java.util.Arrays;

public class MyArrayListV3 {
    // 상수로 선언한 배열 크기 - 기본 수용량
    private static final int DEFAULT_CAPACITY = 5;

    //  다양한 타입의 데이터를 보관하기 위한 Object 타입 배열
    private Object[] elementData;
    // 배열의 현재 사이즈
    private int size = 0;

    // 생성자 1 - 배열 크기 초기화
    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    // 생성자 2 - 초기 수용량 (배열 크기) 직접 설정
    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    // 입력된 데이터에 따른 현재 배열 크기 반환 메서드
    public int size() {
        return size;
    }

    // 현재 배열의 마지막 인덱스에 값을 추가하고 size 를 1 늘리는 메서드
    // 배열이 꽉 찼다면 배열 크기를 2배로 늘림
    public void add(Object o) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size++] = o;
    }

    // 인수로 전달받은 index 에 값을 추가하는 add 메서드
    public void add(int index, Object o) {
        if (size == elementData.length) {
            grow();
        }
        shiftRightFrom(index);
        elementData[size++] = o;
    }

    // index 에 값 추가를 위한 index 이후 값을 오른쪽으로 한 칸씩 미는 메서드
    private void shiftRightFrom(int index) {
        for (int i = elementData.length - 1; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    // 배열 크기를 2배로 늘린 새 배열로 참조 변경
    // 기존 배열은 GC당함
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    // 인수로 넘어온 index 값 삭제하는 메서드
    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    // index 값이 삭제됨에 따라 index 값부터 배열의 끝까지 값을 한 칸씩 땡겨
    // 값을 채워주는 메서드
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    // 현재 배열에서 인수로 넘어온 값의 index 값을 반환해주는 메서드
    public Object get(int index) {
        return elementData[index];
    }

    // 현재 배열에 인수로 넘어온 index 값에 newValue 로 바꾸고
    // 기존의 값을 반환해주는 메서드
    public Object set(int index, Object newValue) {
        Object oldValue = get(index);
        elementData[index] = newValue;
        return oldValue;
    }

    // 인수로 넘어온 값을 현재 배열에서 검색한 뒤
    // 해당 값의 인덱스를 반환해주는 메서드
    // 해당 값이 존재하지 않는다면 -1 반환
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    // toString 메서드 오버라이딩 재정의
    // copyOf()를 통해 현재 배열의 size 만큼의 배열 복사 후 출력해주는 메서드
    // 현재 배열의 사이즈와 설정된 최대 수용량도 반환
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))
                + ", size = " + size + ", capacity = " + elementData.length;
    }
}
