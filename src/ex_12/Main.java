package ex_12;

public class Main {
    // 다이어그램의 '+ main(args: String[])'
    public static void main(String[] args) {
        // 1. Main -> WeekendPricePolicy (<<create>> 점선)
        // 사용할 구체적인 가격 정책 객체를 생성.
        PricePolicy policy = new WeekendPricePolicy(10);
        //PricePolicy policy = new WeekdayPricePolicy(2000);

        // 2. Main -> TicketService (<<create>> 점선)
        // 서비스 객체를 생성하면서, 위에서 만든 정책 객체를 생성자를 통해 주입(DI).
        TicketService service = new TicketService(policy);

        // 3. 서비스의 예약 기능 실행
        service.reserve("어벤져스", 15000);
    }
}
