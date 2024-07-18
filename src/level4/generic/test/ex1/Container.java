package level4.generic.test.ex1;

public class Container<T> {

    private T item;

    public boolean isEmpty() {
        return item == null;
    }

    public void setItem(T data) {
        this.item = data;
    }

    public T getItem() {
        return item;
    }
}
