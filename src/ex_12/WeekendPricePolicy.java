package ex_12;

public class WeekendPricePolicy implements PricePolicy {

    private int extraPercent;

    public WeekendPricePolicy(int extraPercent) {
        this.extraPercent = extraPercent;
    }

    @Override
    public int calculate(int price) {
        return price + (price * extraPercent/100);
    }
}
