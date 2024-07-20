package level4.generic;

// 제네릭 타입의 TypeContainer
public class TypeContainer<T> {

    // T 타입으로 입력받은 데이터
    private T data;

    // T 타입의 데이터 set
    public void setData(T data) {
        this.data = data;
    }

    // T 타입의 데이터 get
    public T getData() {
        return data;
    }

    // data 타입을 반환
    public Class<?> getType() {
        return data.getClass();
    }
}
