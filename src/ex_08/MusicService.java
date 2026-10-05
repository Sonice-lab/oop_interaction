package ex_08;

import java.util.List;

public class MusicService {

    private MusicDao dao;
    public MusicService (MusicDao dao) {
        this.dao = dao;
    }


    public void addMusic(String title, String artist) {
        Music newMusic = new Music(title, artist);
        dao.insert(newMusic);
    }

    public void printPlaylist() {
        List<Music> musics = dao.findAll();
        System.out.println("--- 내 플레이리스트 ---");
        for(Music music : musics) {
            System.out.println("곡명: " + music.getTitle() + " 아티스트명: " + music.getArtist());
        }
    }
}
