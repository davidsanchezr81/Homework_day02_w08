package com.example.rocco.coralfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EndangeredFish endangeredFish = new EndangeredFish();
        ArrayList<CoralFish> fishlist = endangeredFish.getList();

        EndangeredFishAdapter fishAdapter = new EndangeredFishAdapter(this, fishlist);

        ListView listView = findViewById(R.id.fishlist);
        listView.setAdapter(fishAdapter);
    }

    public void onListItemClick(View listItem){

        CoralFish selectedCoralFish = (CoralFish) listItem.getTag();

        Log.e("MainActivity", selectedCoralFish.getName());

        Intent intent = new Intent(this,CoralFishActivity.class);
        intent.putExtra("Coral Fish",selectedCoralFish);

        startActivity(intent);

    }
}
