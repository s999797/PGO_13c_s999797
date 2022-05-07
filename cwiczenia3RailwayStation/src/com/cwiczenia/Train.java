package com.cwiczenia;

public class Train {
    private String trainName;

    public Train(String trainName) {
        this.setTrainName(trainName);
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        if(trainName == null || trainName.isEmpty()){
            throw new IllegalArgumentException("Train name cannot be null or empty.");
        }
        this.trainName = trainName;
    }

}
