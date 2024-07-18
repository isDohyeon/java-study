package level4.generic.test.ex2;

public class Pair<T, S> {

    private T firstData;
    private S secondData;

    public void setFirst(T data) {
        firstData = data;
    }

    public T getFirst() {
        return firstData;
    }

    public void setSecond(S data) {
        secondData = data;
    }

    public S getSecond() {
        return secondData;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstData=" + firstData +
                ", secondData=" + secondData +
                '}';
    }
}
