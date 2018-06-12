package com.example.android.musicalstructure;

/**
 * Created by Elena on 29/4/2018.
 */

public class Item {
    /**
     *  This is a custom class that holds the name of the artist and the song
     */
    private String mArtist;
    private String mSong;

    public Item(String artist, String song){
        mArtist = artist;
        mSong = song;
    }

    /**
     *
     * @return the name of the artist
     */
    public String getArtist(){
        return mArtist;
    }

    /**
     *
     * @return the name of the song
     */
    public String getSong(){
        return mSong;
    }
}
