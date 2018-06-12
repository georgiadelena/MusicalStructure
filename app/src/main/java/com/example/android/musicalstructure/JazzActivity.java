package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Elena on 29/4/2018.
 */

public class JazzActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Ray Charles", "Hit The Road Jack"));
        items.add(new Item("Frank Sinatra", "I've Got You Under My Skin"));
        items.add(new Item("Nat King Cole", "Unforgettable"));
        items.add(new Item("Nina Simone", "My Baby Just Cares For Me "));
        items.add(new Item("Louis Armstrong, Ella Fitzgerald", "Dream A Little Dream of Me "));
        items.add(new Item("Dinah Washington", "Cry Me A River"));

        ItemAdapter adapter = new ItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // When the user clicks on an an artist-song item, we need to navigate to the play now activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Item} object at the given position the user clicked on
                Item item = items.get(position);

                Intent playIntent = new Intent(JazzActivity.this, NowPlayingActivity.class);
                // Passing artist and song name to the play now activity
                playIntent.putExtra("EXTRA_ARTIST_ID", item.getArtist());
                playIntent.putExtra("EXTRA_SONG_ID", item.getSong());
                startActivity(playIntent);
            }
        });
    }
}
