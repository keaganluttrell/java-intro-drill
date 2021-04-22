import java.util.ArrayList;

public class Playlist {
    public String name;
    public ArrayList<Song> list = new ArrayList<Song>();

    public Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void addSong(Song song) {
        list.add(song);
    }

    public String[] songNames() {
        String[] titles = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            titles[i] = list.get(i).title;
        }
        return titles;
    }

    public int totalDuration() {
        int total = 0;
        for(Song s : list) {
            total += s.durationInSeconds;
        }
        return total;
    }

    public void swap(Song a, Song b) {
        int indexA = list.indexOf(a);
        int indexB = list.indexOf(b);
        list.set(indexA, b);
        list.set(indexB, a);
    }

    public Song removeSong(Song song) {
        int i = list.indexOf(song);
        return list.remove(i);
    }
}
