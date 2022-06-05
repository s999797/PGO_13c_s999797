package com.cwiczenia;

public class Ore extends Mineral{
    protected boolean metalic;

    public Ore(String name, int baseReagent, int power,boolean metalic){
        super(name, baseReagent, power);
        setMetalic(metalic);
    }

    public boolean isMetalic() {
        return metalic;
    }

    public void setMetalic(boolean metalic) {
        this.metalic = metalic;
    }

    @Override
    public int getReagent() {
        if(!this.metalic){
            return super.getReagent()/2;
        }
        return super.getReagent();
    }

}
