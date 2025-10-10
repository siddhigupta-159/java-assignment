// 15. Write a Java program to create a class called"MusicLibrary" with a collection of songs and
// methods to add and remove songs, and to play a random song.

// 15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and
// methods to add and remove songs, and to play a random song.

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
    ArrayList<Song> slist = new ArrayList<Song>();
    Random rand = new Random();

    public void addSong(Song s) {
        slist.add(s);
    }

    public void removeSong(Song s) {
        slist.remove(s);
    }

    public void playRandomSong() {
        if (slist.size() == 0) {
            System.out.println("No songs in library!");
        } else {
            int index = rand.nextInt(slist.size());
            Song randomSong = slist.get(index);
            System.out.println("Now playing: " + randomSong.getDetails());
        }
    }

    public void displaySongs() {
        for (Song s : slist) {
            System.out.println("Song: " + s.getDetails());
        }
    }
}

class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getDetails() {
        return title;
    }
}

class P15 {
    public static void main(String[] args) {
        Song s1 = new Song("Shape of You");
        Song s2 = new Song("Perfect");
        Song s3 = new Song("Believer");

        MusicLibrary m = new MusicLibrary();
        m.addSong(s1);
        m.addSong(s2);
        m.addSong(s3);

        m.displaySongs();
        m.playRandomSong();

        m.removeSong(s2);
        m.displaySongs();
    }
}
