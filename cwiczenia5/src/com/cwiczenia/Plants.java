package com.cwiczenia;

public class Plants extends Ingredient{
    protected int toxcity;

    public Plants(String name, int baseReagent, int toxcity){
        super(name, baseReagent);
        setToxcity(toxcity);

    }

    public int getToxcity() {
        return toxcity;
    }

    public void setToxcity(int toxcity) {
        if(toxcity < 0 ){
            throw new IllegalArgumentException("The toxcity cannot be negative.");
        }
        this.toxcity = toxcity;
    }

    @Override
    public int getReagent() {
        return super.getReagent();
    }
}
