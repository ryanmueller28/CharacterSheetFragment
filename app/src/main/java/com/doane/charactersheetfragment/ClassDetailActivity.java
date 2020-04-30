package com.doane.charactersheetfragment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

public class ClassDetailActivity extends AppCompatActivity {

    public static final String EXTRA_CLASS_ID = "classId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int classId = (Integer)getIntent().getExtras().get(EXTRA_CLASS_ID);
        String classNames = CharacterClass.classes[classId].getName();
        TextView textView = findViewById(R.id.classes_text);
        textView.setText(classNames);
        int classImage = CharacterClass.classes[classId].getImageResourceId();
        ImageView imageView = findViewById(R.id.class_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, classImage));
        imageView.setContentDescription(classNames);


    }
}
