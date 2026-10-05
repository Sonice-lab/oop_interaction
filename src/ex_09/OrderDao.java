package ex_09;

import java.util.List;

public interface OrderDao {
    void insert(Order order);
    List<Order> findAll();
}
