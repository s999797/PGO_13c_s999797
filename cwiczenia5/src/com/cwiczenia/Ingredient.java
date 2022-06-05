package com.cwiczenia;

public class Ingredient {
    protected String name;
    protected int baseReagent;

    public Ingredient(String name, int baseReagent) {
        setName(name);
        setBaseReagent(baseReagent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name == null){
            throw new IllegalArgumentException("Name cannot be empty or null.");
        }
        this.name = name;
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public void setBaseReagent(int baseReagent) {
        if(baseReagent <= 0){
            throw new IllegalArgumentException("Base of the reagent cannot be negative or equal zero.");
        }
        this.baseReagent = baseReagent;
    }
    public int getReagent(){
        return this.baseReagent;
    }
}
