package level2.immutable.ex;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 불변 객체 값 변경 (year 만)
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public int getYear() {
        return year;
    }
}
