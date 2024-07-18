package level4.generic.ex3;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T b1, T b2) {
        return b1.getHp() >= b2.getHp() ? b1 : b2;
    }
}
