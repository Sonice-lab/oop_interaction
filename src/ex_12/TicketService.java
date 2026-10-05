package ex_12;

public class TicketService {
    // 1. 빈 마름모 기호 및 '- pricePolicy'를 보고 private 멤버 변수로 선언.
    // 구체적인 클래스가 아닌 인터페이스 타입으로 선언하여 결합도를 낮추기.
    private PricePolicy pricePolicy;

    // 2. 다이어그램의 생성자 '+ TicketService(pricePolicy: PricePolicy)' 구현.
    // 외부에서 정책 객체를 주입받는 DI(의존성 주입) 패턴입니다.
    public TicketService(PricePolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    // 3. 다이어그램의 '+ reserve(movieTitle: String, price: int)' 메서드
    public void reserve(String movieTitle, int price) {
        // 주입받은 정책에 따라 가격을 먼저 계산.
        int calculatedPrice = pricePolicy.calculate(price);

        // 4. <<create>> 화살표를 보고 Ticket 객체를 생성(new).
        Ticket ticket = new Ticket(movieTitle, calculatedPrice);

        System.out.println(ticket.getMovieTitle() + " 예매 완료 (가격: " + ticket.getPrice() + ")");
    }
}
