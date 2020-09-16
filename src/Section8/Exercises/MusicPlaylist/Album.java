package Section8.Exercises.MusicPlaylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private String artistName;
    private ArrayList<Song> songs;

    public Album(String albumName, String artistName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songs = new ArrayList<Song>();
    }

    public  void printList(ArrayList<Song> songs) {
        Iterator<Song> i = songs.iterator();
        while (i.hasNext()) {
            System.out.println("Now listening " + i.next());
        }
        System.out.println("=========================");
    }

    public  boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }


    private Song findSong(String title) {
        for (int i = 0; i < this.songs.size(); i++) {
            Song song = this.songs.get(i);
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist (int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index>=0)&& (index<=this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track"+ trackNumber);
        return false;
    }

    public boolean addToPlaylist (String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong!=null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song "+  title + " is not in this album");
        return false;
    }



}