package Section8.Exercises.MusicPlaylist;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {
        Album brainstorm = new Album("Rudens", "Brainstorm");
        brainstorm.addSong("Plaukstas lieluma pavasaris", 3.45);
        brainstorm.addSong("Kaķēns", 3.54);
        brainstorm.addSong("Ziemā", 2.57);
        brainstorm.addSong("Četri krasti", 4.12);
        brainstorm.addSong("Īssavienojums", 4.23);
        albums.add(brainstorm);


        Album tumsa = new Album("Putni", "Tumsa");
        tumsa.addSong("Klauns", 3.45);
        tumsa.addSong("Atlantīda", 3.54);
        tumsa.addSong("Lietus dārzs", 2.57);
        tumsa.addSong("Suns", 4.12);
        tumsa.addSong("Riekstkoka sirds", 4.23);
        albums.add(tumsa);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Kaķēns", playlist);
        albums.get(0).addToPlaylist("Ziemā", playlist);
        albums.get(0).addToPlaylist("Četri krasti", playlist);
        albums.get(1).addToPlaylist("Suns", playlist);
        albums.get(1).addToPlaylist("Riekstkoka sirds", playlist);
        albums.get(1).addToPlaylist(1, playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        boolean previous = false;
        int action = 0;
        printActions();

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }


        while (!quit) {
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    printActions();
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                        forward = true;
                    } else {
                        System.out.println("You have reached end of playlist");
                        forward = false;
                    }

                    break;
                case 2:
                    if (!previous) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        previous = true;
                    } else {
                        System.out.println("This is the first song");
                        previous = false;
                    }

                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("You've reached the start of your playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("You've reached the end of your playlist");
                        }
                    }
                    break;

                case 4:
                    if (playlist.size() !=0){
                            listIterator.remove();}
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }
                    else if (listIterator.hasPrevious())
                    {
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }


                    break;
                case 5:
                    printPlaylist(playlist);
                    break;
                case 6:
                    quit = true;
                    System.out.println("Music player switches off");
                    break;

            }

        }


    }


    private static void printActions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - instructions");
        System.out.println("\t 1 - next song");
        System.out.println("\t 2- previous song");
        System.out.println("\t 3 - replay");
        System.out.println("\t 4 - show playlist");
        System.out.println("\t 5 - remove current song from playlist");
        System.out.println("\t 6 - quit");
        System.out.println("\t Choose your actions");
    }


    private static void printPlaylist(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." +
                    list.get(i).toString());
        }
    }

}


// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.

// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
