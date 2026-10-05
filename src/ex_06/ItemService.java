package ex_06;

import java.util.List;

public class ItemService {

    // 인터페이스 타입으로 선언하고, 실제 동작할 구현체 객체를 생성하여 연결(다형성)
    private ItemDao dao = new MemoryItemDao();

    public void obtainItem(String name, String grade) {
        Item newItem = new Item(name, grade);
        dao.insert(newItem);
    }

    public void printInvrntory() {
        List<Item> items = dao.findAll();
        System.out.println("--- 현재 인벤토리 목록---");
        for (Item item : items) {
            System.out.println("등급: [" + item.getGrade() + "] | 아이템명: " + item.getName());
        }
    }
}
