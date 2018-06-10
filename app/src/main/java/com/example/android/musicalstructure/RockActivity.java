package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Elena on 29/4/2018.
 */

public class RockActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Lachrymose","The Unseen"));
        items.add(new Item("Lachrymose", "Nepenthe"));
        items.add(new Item("Lachrymose", "Capricorn Descending"));
        items.add(new Item("Primordial", "Empire Falls"));
        items.add(new Item("Walking Stone Giants", "Buried Alive"));
        items.add(new Item("The Psalm", "Ascetic"));

        ItemAdapter adapter = new ItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
