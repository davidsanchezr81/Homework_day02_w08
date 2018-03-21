package com.example.rocco.coralfish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rocco on 20/03/2018.
 */

public class EndangeredFishAdapter extends ArrayAdapter<CoralFish>{

    public EndangeredFishAdapter(Context context, ArrayList<CoralFish> fishlist){
        super(context,0,fishlist);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        CoralFish currentCoralFish = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fish_item, parent, false);
        }
        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentCoralFish.getRanking().toString());

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentCoralFish.getName());

        TextView species = listItemView.findViewById(R.id.species);
        species.setText(currentCoralFish.getSpecies());

        TextView location = listItemView.findViewById(R.id.location);
        location.setText(currentCoralFish.getLocation());

        listItemView.setTag(currentCoralFish);
        return listItemView;
    }

}
