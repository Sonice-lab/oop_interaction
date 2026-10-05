package ex_09;

import java.util.List;

public class OrderService {
    private OrderDao dao;

    public OrderService(OrderDao dao) {
        this.dao = dao;
    }

    public void takeOrder(String menuName, int price) {
        Order newOrder = new Order(menuName, price);
        dao.insert(newOrder);
    }

    public void printAllOrders() {
        List<Order> orders = dao.findAll();
        System.out.println("--- 전체 주문 내역 ---");
        for (Order order : orders) {
            System.out.println("메뉴: " + order.getMenuName() + " | 가격: " + order.getPrice() + "원");
        }
    }
}
