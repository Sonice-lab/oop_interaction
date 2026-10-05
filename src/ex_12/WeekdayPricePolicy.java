package ex_12;

public class WeekdayPricePolicy implements PricePolicy{

    private int discountAmount;

    // 객체 생성 시 할인 금액을 주입받아 초기화하도록 생성자 추가
    public WeekdayPricePolicy (int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int calculate(int price) {
        return price - discountAmount;
    }
}
