package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);


        //Library Activity and Intent Implementation

        Button library = (Button) findViewById(R.id.albums_library);

// Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(Albums.this, MainActivity.class);
                startActivity(libraryIntent);
            }
        });


        // Find the View that shows the Now Playing Section

        Button nowPlaying = (Button) findViewById(R.id.albums_now_playing);

// Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(Albums.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
