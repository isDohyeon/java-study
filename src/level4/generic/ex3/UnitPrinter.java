package level4.generic.ex3;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        shuttle.showInfo();
    }
}
