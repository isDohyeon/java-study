package level4.generic;

public class TypeContainerMain {

    public static void main(String[] args) {
        // String 타입으로 생성
        TypeContainer<String> stringTypeContainer = new TypeContainer<>();
        stringTypeContainer.setData("String data");
        System.out.println("저장 데이터 : " + stringTypeContainer.getData());
        System.out.println("설정된 타입 : " + stringTypeContainer.getType());
        System.out.println();

        // Character 타입으로 생성
        TypeContainer<Character> characterTypeContainer = new TypeContainer<>();
        characterTypeContainer.setData('A');
        System.out.println("저장 데이터 : " + characterTypeContainer.getData());
        System.out.println("설정된 타입 : " + characterTypeContainer.getType());
        System.out.println();

        // Integer 타입으로 생성
        TypeContainer<Integer> integerTypeContainer = new TypeContainer<>();
        integerTypeContainer.setData(10);
        System.out.println("저장 데이터 : " + integerTypeContainer.getData());
        System.out.println("설정된 타입 : " + integerTypeContainer.getType());
        System.out.println();

        // Double 타입으로 생성
        TypeContainer<Double> doubleTypeContainer = new TypeContainer<>();
        doubleTypeContainer.setData(3.141592);
        System.out.println("저장 데이터 = " + doubleTypeContainer.getData());
        System.out.println("설정된 타입 : " + doubleTypeContainer.getType());
        System.out.println();

        // Boolean 타입으로 생성
        TypeContainer<Boolean> booleanTypeContainer = new TypeContainer<>();
        booleanTypeContainer.setData(true);
        System.out.println("저장 데이터 : " + booleanTypeContainer.getData());
        System.out.println("설정된 타입 : " + booleanTypeContainer.getType());
        System.out.println();
    }
}
