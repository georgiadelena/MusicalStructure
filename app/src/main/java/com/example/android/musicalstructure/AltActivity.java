package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Elena on 29/4/2018.
 */

public class AltActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Alev Lenz", "Fall Into Me"));
        items.add(new Item("Imagine Dragons", "Believer"));
        items.add(new Item("Arctic Monkeys", "Do I Wanna Know?"));
        items.add(new Item("The Cure", "Just Like Heaven"));
        items.add(new Item("Nirvana", "Heart-shaped Box"));
        items.add(new Item("The Smashing Pumpkins", "Bleed"));

        ItemAdapter adapter = new ItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // When the user clicks on an an artist-song item, we need to navigate to the play now activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Item} object at the given position the user clicked on
                Item item = items.get(position);

                Intent playIntent = new Intent(AltActivity.this, NowPlayingActivity.class);
                // Passing artist and song name to the play now activity
                playIntent.putExtra("EXTRA_ARTIST_ID", item.getArtist());
                playIntent.putExtra("EXTRA_SONG_ID", item.getSong());
                startActivity(playIntent);
            }
        });
    }
}
