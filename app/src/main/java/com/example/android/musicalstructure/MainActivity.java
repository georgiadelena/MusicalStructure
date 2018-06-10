package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView alternative = (TextView) findViewById(R.id.alternative);
        alternative.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the Alternative View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, AltActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView jazz = (TextView) findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(colorIntent);
            }
        });

        TextView rock = (TextView) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(phrasesIntent);
            }
        });

        TextView metal = (TextView) findViewById(R.id.metal);
        metal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, MetalActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
