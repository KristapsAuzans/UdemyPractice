package Section9.Training.InnerClass;

import java.util.ArrayList;
import java.util.List;


public class Album {
    private String name;
    private String artist;
    private SongList songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();

    }

    public boolean addSong(String title, double duration) {
       return this.songs.addSong(new Song(title, duration));
    }


    public boolean addToPlayList(int trackNumber, List<Song> playList) {
       Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + trackNumber + " is not in this album");
        return false;


    }

    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }



        public boolean addSong(Song song) {
            if(songs.contains(song)) {
                return false;
            }
             this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index >0) && (index<songs.size())){
                return songs.get(index);
            }

            return null;
        }


    }

    // Modify the playlist challenge so that the Album class uses an inner class.
    // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
    // The inner SongList class will use an ArrayList and will provide a method to add a song.
    // It will also provide findSong() methods which will be used by the containing Album class
    // to add songs to the playlist.
    // Neither the Song class or the Main class should be changed.





}
