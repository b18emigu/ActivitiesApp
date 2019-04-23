package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);

        TextView mountainName = (TextView) findViewById(R.id.mountainNameTW);
        TextView mountainLocation = (TextView) findViewById(R.id.mountainLocationTW);
        TextView mountainHeight = (TextView) findViewById(R.id.mountainHeightTW);


        Intent intent = getIntent();
        String[] mountain_string_extras = intent.getStringArrayExtra("MOUNTAIN_STRING_DATA");
        int mountain_int_extra = intent.getIntExtra("MOUNTAIN_INT_DATA", 0);

        mountainName.setText(mountain_string_extras[0]);
        mountainLocation.setText(mountain_string_extras[1]);
        mountainHeight.setText(mountain_int_extra + "m");
    }
}
