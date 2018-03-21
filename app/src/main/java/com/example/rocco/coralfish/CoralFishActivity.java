package com.example.rocco.coralfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CoralFishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coral_fish);

        Intent intent = getIntent();
        CoralFish selectedCoralFIsh = (CoralFish) intent.getSerializableExtra("coralfish");
        Log.e("Coral Fish Activity", selectedCoralFIsh.getName());
    }
}
