package ex_06;

import java.util.List;

public interface ItemDao {
    void insert(Item item);
    List<Item> findAll();
}
