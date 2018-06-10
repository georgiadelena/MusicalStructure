package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Elena on 30/4/2018.
 */

public class NowPlayingActivity extends AppCompatActivity {

    String artist;
    String song;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                artist = null;
                song = null;
            } else {
                artist = extras.getString("EXTRA_ARTIST_ID");
                song = extras.getString("EXTRA_SONG_ID");
            }
        } else {
            artist = (String) savedInstanceState.getSerializable("EXTRA_ARTIST_ID");
            song = (String) savedInstanceState.getSerializable("EXTRA_SONG_ID");
        }

        TextView mArtist = (TextView) findViewById(R.id.now_playing_artist);
        mArtist.setText(artist); // insert artist taken for the previous activity

        TextView mSong = (TextView) findViewById(R.id.now_playing_song);
        mSong.setText(song); // insert artist taken for the previous activity
    }
}
