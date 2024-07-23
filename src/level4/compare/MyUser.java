package level4.compare;

// Comparable 구현 안할 시
// Exception in thread "main" java.lang.ClassCastException:
// class level4.compare.MyUser cannot be cast to class java.lang.Comparable
public class MyUser implements Comparable<MyUser> {

    // 이름, 나이 (정렬 기준)
    private String name;
    private int age;

    // 생성자
    public MyUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 이름 반환
    public String getName() {
        return name;
    }

    // 나이 반환
    public int getAge() {
        return age;
    }

    @Override
    // 나이 기준 정렬
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
