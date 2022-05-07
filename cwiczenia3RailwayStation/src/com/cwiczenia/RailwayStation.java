package com.cwiczenia;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {

    private String railwayStationName;
    private int platformsNumber = 3; // Czy może być tu 3 czy w kontstruktorze?
    private List<Train> trains = new ArrayList<>();

    public RailwayStation(String railwayStationName) {
        this.setName(railwayStationName);// czy tu musi być this?
    }

    public String getName() {
        return railwayStationName;
    }

    public void setName(String railwayStationName) {
        if(railwayStationName == null || railwayStationName.isEmpty()){
            throw new IllegalArgumentException("Railway Station name cannot be null or empty.");
        }
        this.railwayStationName = railwayStationName;
    }

    public int getPlatformsNumber() {
        return platformsNumber;
    }

    public void setPlatformsNumber(int platformsNumber) {
        if(platformsNumber < 3){
            throw new IllegalArgumentException("Paltforms number have to be greater or equal to 3.");
        }
        this.platformsNumber = platformsNumber;
    }

    public void IncreaseTracs(int platformsNumber) {
        if(platformsNumber < 0){
            throw new IllegalArgumentException("Platforms number have to be greater than 0.");
        }
        this.platformsNumber += platformsNumber;
    }

    public void LaunchTrain(String trainName) {
        if(trains.size() >= platformsNumber){
            throw new IllegalArgumentException("Too small paltforms to lunch train.");
        }
        trains.add(new Train(trainName));
    }
}
