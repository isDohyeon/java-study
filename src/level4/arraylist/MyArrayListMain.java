package level4.arraylist;

public class MyArrayListMain {

    public static void main(String[] args) {
        // MyArrayList<String> 인스턴스 생성 및 사용
        MyArrayList<String> stringList = new MyArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add(1, "Java");
        System.out.println("String 리스트: " + stringList);
        System.out.println("String 리스트 크기: " + stringList.size());
        System.out.println("Index 1의 값: " + stringList.get(1));
        System.out.println("World의 인덱스: " + stringList.indexOf("World"));
        stringList.set(1, "Programming");
        System.out.println("변경된 리스트: " + stringList);
        stringList.remove(2);
        System.out.println("삭제 후 리스트: " + stringList);
        System.out.println();

        // MyArrayList<Integer> 인스턴스 생성 및 사용
        MyArrayList<Integer> intList = new MyArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6); // grow 메서드가 호출되어 배열 크기 2배로 늘어남
        System.out.println("Integer 리스트: " + intList);
        System.out.println("Integer 리스트 크기: " + intList.size());
        System.out.println("Index 2의 값: " + intList.get(2));
        System.out.println("3의 인덱스: " + intList.indexOf(3));
        intList.set(2, 99);
        System.out.println("변경된 리스트: " + intList);
        intList.remove(4);
        System.out.println("삭제 후 리스트: " + intList);
        System.out.println();

        // MyArrayList<Boolean> 인스턴스 생성 및 사용
        MyArrayList<Boolean> booleanList = new MyArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);
        System.out.println("Boolean 리스트: " + booleanList);
        System.out.println("Boolean 리스트 크기: " + booleanList.size());
        System.out.println("Index 0의 값: " + booleanList.get(0));
        System.out.println("false의 인덱스: " + booleanList.indexOf(false));
        booleanList.set(1, true);
        System.out.println("변경된 리스트: " + booleanList);
        booleanList.remove(2);
        System.out.println("삭제 후 리스트: " + booleanList);
        System.out.println();
    }
}
