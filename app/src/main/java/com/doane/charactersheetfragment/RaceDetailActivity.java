package com.doane.charactersheetfragment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RaceDetailActivity extends AppCompatActivity {
    public static final String EXTRA_RACE_ID = "raceId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int raceId = (Integer)getIntent().getExtras().get(EXTRA_RACE_ID);
        String classNames = CharacterRace.races[raceId].getName();
        TextView textView = findViewById(R.id.classes_text);
        textView.setText(classNames);
        int raceImage = CharacterRace.races[raceId].getImageResourceId();
        ImageView imageView = findViewById(R.id.class_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, raceImage));
        imageView.setContentDescription(classNames);


    }
}
