package level2.poly.ex.pay0;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("naver")) {
            return new KakaoPay();
        } else if (option.equals("kakao")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
