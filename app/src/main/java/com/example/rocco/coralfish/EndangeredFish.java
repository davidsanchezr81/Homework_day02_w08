package com.example.rocco.coralfish;

import java.util.ArrayList;

/**
 * Created by rocco on 20/03/2018.
 */

public class EndangeredFish {

    private ArrayList<CoralFish> fishlist;

    public EndangeredFish() {
        fishlist = new ArrayList<CoralFish>();
        fishlist.add(new CoralFish(1, "Percula clownfish", "Amphiprion Ocellaris", "Indo-Pacific"));
        fishlist.add(new CoralFish(2, "Japan surgeonfish", "Acanthurus japonicus", "Indo-Pacific"));
        fishlist.add(new CoralFish(3, "Pink anemonefish", "Amphiprion perideraion", "Eastern Indian Ocean"));
        fishlist.add(new CoralFish(4, "Flame angel", "Centropyge loricula","Central Pacific"));
        fishlist.add(new CoralFish(5, "Racoon butterflyfish", "Chaetodon lunula", "East Africa"));
        fishlist.add(new CoralFish(6, "Royal Gramma basslet", "Gramma loreto","Western Central Atlantic"));
        fishlist.add(new CoralFish(7, "Longfin pennantfish", "Heniochus acuminatus","South Pacific"));
        fishlist.add(new CoralFish(8, "King angelfish", "Holacanthus passer", "Eastern Pacific"));
        fishlist.add(new CoralFish(9, "Palette surgeonfish", "Paracanthurus hepatus", "Indo-Pacific"));
        fishlist.add(new CoralFish(10, "Arabian angelfish", "Pomacanthus asfur","Red Sea"));

    }

    public ArrayList<CoralFish> getList() {
        return new ArrayList<CoralFish>(fishlist);
    }

}

