package com.cwiczenia;

public class Liquid extends Ingredient {
    protected int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        setDissolubility(dissolubility);
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if(dissolubility < 0 || dissolubility > 100){
            throw new IllegalArgumentException("Dissolubility have to be in the 0 - 100 range.");
        }
        this.dissolubility = dissolubility;
    }

    @Override
    public int getReagent() {
        return this.getDissolubility() * super.getReagent();
    }
}
