package ex_06;

public class Main {

    public static void main(String[] args) {
        ItemService service = new ItemService();

        service.obtainItem("초보자의 단검", "일반");
        service.obtainItem("정령의 망토", "희귀");
        service.obtainItem("드래곤 슬레이어", "전설");

    }// end of main
}// end of class
