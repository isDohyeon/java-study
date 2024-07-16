package level2.math;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lotto = new int[6];

    public int[] generate() {
        for (int i = 0; i < lotto.length; i++) {
            int number;
            do {
                number = random.nextInt(45) + 1;
            } while (!isUnique(number, i));
            
            lotto[i] = number;
        }

        return lotto;
    }

    private boolean isUnique(int number, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (lotto[i] == number) {
                return false;
            }
        }
        return true;
    }
}
