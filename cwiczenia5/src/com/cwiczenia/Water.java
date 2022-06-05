package com.cwiczenia;

public class Water extends Liquid{
    protected boolean distilled;

    public Water(String name, int baseReagent, int dissolubility, boolean distilled) {
        super(name, baseReagent, dissolubility);
        setDistilled(distilled);
    }

    public boolean isDistilled() {
        return distilled;
    }

    public void setDistilled(boolean distilled) {
        this.distilled = distilled;
    }

    @Override
    public int getReagent() {
        if(!this.distilled){
            return super.getReagent()/2; // Utnie części dziesiętne. Czy metody nie powinny być double?
        }
        return super.getReagent();
    }
}
