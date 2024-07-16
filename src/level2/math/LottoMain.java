package level2.math;

public class LottoMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] result = lottoGenerator.generate();
        System.out.print("로또 번호 : ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
