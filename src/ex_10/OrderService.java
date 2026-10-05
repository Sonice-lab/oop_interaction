package ex_10;

// 비즈니스 로직 객체 (주입 대상)
public class OrderService {
    // 인터페이스로 참여
    private DiscountPolicy discountPolicy;

    // DI - 생성자 의존 주입
    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void takeOrder(String menuName, int price) {
        Order newOrder = new Order(menuName, price);
        int discountAmount = discountPolicy.discount(newOrder.getPrice());
        int finalPrice = newOrder.getPrice() - discountAmount;
        System.out.println(newOrder.getMenuName() + " | 정가 : " +
                newOrder.getPrice() + " 원 | 할인 :  " + discountAmount + " 원 | 결제 금액 : " + finalPrice + " 원");
    }
}

