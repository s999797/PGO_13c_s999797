package com.cwiczenia;

public class Crystal extends Mineral{
    protected int magicPower;

    public Crystal(String name, int baseReagent, int power,int magicPower){
        super(name, baseReagent, power);
        setMagicPower(magicPower);
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if(magicPower <= 0){
            throw new IllegalArgumentException("Magic power cannot be negative or equal zero.");
        }
        this.magicPower = magicPower;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + this.magicPower;
    }
}
