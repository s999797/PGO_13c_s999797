package com.cwiczenia;

public class Mineral extends Ingredient{
    protected int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        setPower(power);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(power <= 0){
            throw new IllegalArgumentException("Power cannot be negative or equal zero.");
        }
        this.power = power;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + this.power;
    }
}
