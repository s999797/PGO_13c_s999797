package com.cwiczenia;

public class Alcohol extends Liquid{
    protected int percentage;

    public Alcohol(String name, int baseReagent, int dissolubility, int percentage) {
        super(name, baseReagent, dissolubility);
        setPercentage(percentage);
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        if(percentage < 0 || percentage > 100){
            throw new IllegalArgumentException("Percent have to be in the 0 - 100 range.");
        }
        this.percentage = percentage;
    }

    @Override
    public int getReagent() {
        return this.percentage * super.getReagent();
    }
}
