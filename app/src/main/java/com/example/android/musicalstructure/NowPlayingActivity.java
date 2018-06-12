package com.example.android.musicalstructure;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Elena on 30/4/2018.
 */

public class NowPlayingActivity extends AppCompatActivity {

    private String artist;
    private String song;
    private Button bPlay, bPause;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_now);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
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

        bPlay = (Button) findViewById(R.id.play_button);
        bPause = (Button) findViewById(R.id.pause_button);

        bPlay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Play Button View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Play utility not available yet! :)", Toast.LENGTH_SHORT).show();
            }
        });

        bPause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Play Button View is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pause utility not available yet! :)", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
