package ex_02;

public class BoardService {

    private BoardDao dao = new BoardDao();

    public void writePost(String title, String content) {
        Board newBoard = new Board(title, content);
        dao.insertPost(newBoard);
    }
}
