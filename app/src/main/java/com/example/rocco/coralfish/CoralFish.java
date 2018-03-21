package com.example.rocco.coralfish;

import java.io.Serializable;

/**
 * Created by rocco on 20/03/2018.
 */

public class CoralFish implements Serializable{

    private Integer ranking;
    private String name;
    private String species;
    private String location;


    public CoralFish(Integer ranking, String name, String species, String location) {
        this.ranking = ranking;
        this.name = name;
        this.species = species;
        this.location = location;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {return name;}

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }
}
