package ex_08;

public class Main {
    public static void main(String[] args) {

        MusicDao dao = new MusicDao();
        MusicService service = new MusicService(dao);
        service.addMusic("회회기담", "Eve");
        service.addMusic("puppet", "natori");
        service.addMusic("AIYOU", "Eve");

        service.printPlaylist();

    } //end of main
}// end of class
